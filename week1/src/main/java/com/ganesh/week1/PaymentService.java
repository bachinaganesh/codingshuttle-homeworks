package com.ganesh.week1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("PaymentService init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PaymentService destroy");
    }
}
