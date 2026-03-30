package com.ganesh.week1;

import com.ganesh.week1.interfaces.Frosting;
import com.ganesh.week1.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(@Qualifier("sf") Frosting frosting, @Qualifier("ss") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        this.frosting.getFrostingType();
        this.syrup.getSyrupType();
    }
}
