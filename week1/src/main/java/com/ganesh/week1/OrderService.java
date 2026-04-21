package com.ganesh.week1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("OrderService destroy");
    }

    public void placeOrder() {
        System.out.println("OrderService placeOrder");
    }
}
