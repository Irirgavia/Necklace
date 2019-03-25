package com.epam.typeStone;

import com.epam.Stone;

import java.awt.*;

public class OrganicStone extends Stone {
    private NatureOrganicStone natureOrganicStone;

    @Override
    public double cost(){
        switch (natureOrganicStone) {
            case AMBER:
                return 60 * this.getCaratWeight();

            case CORAL:
                return 70 * this.getCaratWeight();

            case PEARLS:
                return 100 * this.getCaratWeight();
        }
        return 0;
    }

    public NatureOrganicStone getNatureOrganicStone() {
        return natureOrganicStone;
    }
    public void setNatureOrganicStone(NatureOrganicStone natureOrganicStone) {
        this.natureOrganicStone = natureOrganicStone;
    }

    public OrganicStone(
            Color color,
            double clarity,
            boolean cut,
            double caratWeight,
            NatureOrganicStone natureOrganicStone
    ){
        super(color, clarity, cut, caratWeight);
        this.natureOrganicStone = natureOrganicStone;
    }
}
