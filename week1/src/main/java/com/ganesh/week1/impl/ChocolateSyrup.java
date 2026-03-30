package com.ganesh.week1.impl;

import com.ganesh.week1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cs")
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
