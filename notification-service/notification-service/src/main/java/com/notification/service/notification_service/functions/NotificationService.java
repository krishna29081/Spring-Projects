package com.notification.service.notification_service.functions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class NotificationService {

@Bean
public Supplier<String> testing() {
    return () -> "This is testing";
    }
}
