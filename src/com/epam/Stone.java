package com.epam;

import java.awt.*;

public abstract class Stone implements Comparable<Stone>{
    private Color color;
    private double clarity;
    private boolean cut;
    private double caratWeight;

    @Override
    public int compareTo(Stone other) {
        if (this.caratWeight > other.caratWeight)
            return 1;
        if (this.caratWeight < other.caratWeight)
            return -1;
        return 0;
    }

    public abstract double cost();

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public double getClarity() {
        return clarity;
    }
    public void setClarity(double clarity) {
        this.clarity = clarity;
    }

    public boolean isCut() {
        return cut;
    }
    public void setCut(boolean cut) {
        this.cut = cut;
    }

    public double getCaratWeight() {
        return caratWeight;
    }
    public void setCaratWeight(double caratWeight) {
        this.caratWeight = caratWeight;
    }

    public Stone(
            Color color,
            double clarity,
            boolean cut,
            double caratWeight
    ){
        this.color = color;
        this.clarity = clarity;
        this.cut = cut;
        this.caratWeight = caratWeight;
    }
}
