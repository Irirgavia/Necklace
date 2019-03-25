package com.epam.typeStone;

import com.epam.Stone;

import java.awt.*;

public class OrnamentalStone extends Stone {
    private NatureOrnamentalStone natureOrnamentalStone;

    @Override
    public double cost(){
        switch (natureOrnamentalStone){
            case AMETHYST:
                return 60 * this.getCaratWeight();

            case GARNET:
                return 70 * this.getCaratWeight();

            case QUARTZ:
                return 100 * this.getCaratWeight();

            case NEPHIRITS:
                return 80 * this.getCaratWeight();
        }
        return 0;
    }

    public NatureOrnamentalStone getNatureOrnamentalStone() {
        return natureOrnamentalStone;
    }
    public void setNatureOrnamentalStone(NatureOrnamentalStone natureOrnamentalStone) {
        this.natureOrnamentalStone = natureOrnamentalStone;
    }

    public OrnamentalStone(
            Color color,
            double clarity,
            boolean cut,
            double caratWeight,
            NatureOrnamentalStone natureOrnamentalStone
    ){
        super(color, clarity, cut, caratWeight);
        this.natureOrnamentalStone = natureOrnamentalStone;
    }
}
