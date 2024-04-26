package com.israelsantiago.bookstore.orderservice;

import com.israelsantiago.bookstore.orderservice.orders.ContainersConfig;
import org.springframework.boot.SpringApplication;

public class TestOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(OrderServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
