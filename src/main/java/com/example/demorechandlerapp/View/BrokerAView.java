package com.example.demorechandlerapp.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BrokerAView extends BaseView {
    @Override
    public void setValueDate(Date valueDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.valueDate = dateFormat.format(valueDate);
    }
}
