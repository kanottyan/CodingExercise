package com.example.demorechandlerapp;

import com.example.demorechandlerapp.ModelAndService.Trade;
import com.example.demorechandlerapp.ModelAndService.TradeService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-test.properties")
public class RestAPITest {
    private String baseUrl;

    @LocalServerPort
    private int port;

    @Autowired
    private TradeService mockService;

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    public void setupSuite() {
        baseUrl = "http://localhost:" + this.port;
    }

    @Test
    public void rootShouldGetHelloWorld() {
        String res = restTemplate.getForObject(baseUrl + "/", String.class);
        assertThat(res).isEqualTo("Hello World");
    }

    @Test
    public void badPathRequestShouldReturn404() {
        ResponseEntity<Object> responseEntity =
                restTemplate.getForEntity(baseUrl + "/badPath", Object.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void allTradesShouldBeDefaultMockNum() {
        ResponseEntity<Trade[]> responseEntity =
                restTemplate.getForEntity(baseUrl + "/trades", Trade[].class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        int expectedTradesNum = mockService.findAll().size();
        int actualTradesNum = Objects.requireNonNull(responseEntity.getBody()).length;
        assertThat(expectedTradesNum).isEqualTo(actualTradesNum);
    }

    @Test
    public void brokerATradesShouldBeFilteredByDownStream() throws JSONException {
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(baseUrl + "/trades/BrokerA", String.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        JSONArray jsonArray = new JSONArray(responseEntity.getBody());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jo = jsonArray.getJSONObject(i);
            String downstream = jo.optString("downstream");
            assertEquals("BrokerA", downstream);
        }
        int expectedTradesNum = mockService.findBlockerA("").size();
        int actualTradesNum = jsonArray.length();
        assertThat(expectedTradesNum).isEqualTo(actualTradesNum);
    }


    @Test
    public void tradesShouldBeFilteredByForward() throws JSONException {
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(baseUrl + "/trades/BrokerA?Product=Forward", String.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

        JSONArray jsonArray = new JSONArray(responseEntity.getBody());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jo = jsonArray.getJSONObject(i);
            String productName = jo.optJSONObject("product").optString("productName");
            assertEquals("Forward", productName);
        }
        int expectedTradesNum = mockService.findBlockerA("Forward").size();
        int actualTradesNum = jsonArray.length();
        assertThat(expectedTradesNum).isEqualTo(actualTradesNum);
    }
}
