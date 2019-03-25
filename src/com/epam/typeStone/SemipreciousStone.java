package com.epam.typeStone;

import com.epam.Stone;

import java.awt.*;

public class SemipreciousStone extends Stone {
    private NatureSemipreciousStone natureSemipreciousStone;

    @Override
    public double cost(){
        switch (natureSemipreciousStone){
            case MOONSTONE:
                return 60 * this.getCaratWeight();

            case OPAL:
                return 70 * this.getCaratWeight();

            case FIANIT:
                return 100 * this.getCaratWeight();

            case TOURMALINE:
                return 80 * this.getCaratWeight();

            case TOPAS:
                return 90 * this.getCaratWeight();
        }
        return 0;
    }

    public NatureSemipreciousStone getNatureSemipreciousStone() {
        return natureSemipreciousStone;
    }
    public void setNatureSemipreciousStone(NatureSemipreciousStone natureSemipreciousStone) {
        this.natureSemipreciousStone = natureSemipreciousStone;
    }

    public SemipreciousStone(
            Color color,
            double clarity,
            boolean cut,
            double caratWeight,
            NatureSemipreciousStone natureSemipreciousStone
    ){
        super(color, clarity, cut, caratWeight);
        this.natureSemipreciousStone = natureSemipreciousStone;
    }
}
