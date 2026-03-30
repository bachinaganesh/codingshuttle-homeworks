package com.ganesh.week1.impl;

import com.ganesh.week1.interfaces.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cf")
public class ChocolateFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }
}
