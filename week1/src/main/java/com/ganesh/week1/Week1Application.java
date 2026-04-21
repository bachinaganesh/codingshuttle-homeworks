package com.ganesh.week1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1Application implements CommandLineRunner {

    private final CakeBaker cakeBaker;
    private final OrderService orderService;
    private final NotificationService notificationService;


    public Week1Application(CakeBaker cakeBaker, OrderService orderService, NotificationService notificationService) {
        this.cakeBaker = cakeBaker;
        this.orderService = orderService;
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Week1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        this.cakeBaker.bakeCake();
//        this.orderService.placeOrder();
        this.notificationService.send("Hello World");
    }
}
