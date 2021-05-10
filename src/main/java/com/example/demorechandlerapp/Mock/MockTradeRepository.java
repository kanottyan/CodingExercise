package com.example.demorechandlerapp.Mock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MockTradeRepository extends JpaRepository<MockTrade, Integer> {
}
