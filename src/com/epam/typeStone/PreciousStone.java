package com.epam.typeStone;

import com.epam.Stone;

import java.awt.*;

public class PreciousStone extends Stone {
    private NaturePreciousStone naturePreciousStone;

    @Override
    public double cost(){
        switch (naturePreciousStone){
            case AQUAMARINE:
                return 60 * this.getCaratWeight();

            case ALEXANDRITE:
                return 70 * this.getCaratWeight();

            case DIAMOND:
                return 100 * this.getCaratWeight();

            case EMERALD:
                return 80 * this.getCaratWeight();

            case RUBY:
                return 90 * this.getCaratWeight();

            case SAPPHIRE:
                return 110 * this.getCaratWeight();
        }
        return 0;
    }

    public NaturePreciousStone getNaturePreciousStone() {
        return naturePreciousStone;
    }
    public void setNaturePreciousStone(NaturePreciousStone naturePreciousStone) {
        this.naturePreciousStone = naturePreciousStone;
    }

    public PreciousStone(
            Color color,
            double clarity,
            boolean cut,
            double caratWeight,
            NaturePreciousStone naturePreciousStone
    ){
        super(color, clarity, cut, caratWeight);
        this.naturePreciousStone = naturePreciousStone;
    }
}
