package com.order.service.order_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class orderController {
    @PostMapping
    public ResponseEntity<?> createOrder(){
       return ResponseEntity.ok("Order Created");
    }
}
