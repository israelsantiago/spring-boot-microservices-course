package com.israelsantiago.bookstore.notifications.events;

import com.israelsantiago.bookstore.notifications.NotificationServiceApplication;
import org.springframework.boot.SpringApplication;

public class TestNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(NotificationServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
