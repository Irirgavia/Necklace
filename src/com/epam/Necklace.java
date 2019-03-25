package com.epam;

import java.awt.*;
import java.util.ArrayList;

public class Necklace {
    private String name;
    private ArrayList<Stone> stones;

    public void addStone(Stone stone){
        stones.add(stone);
    }
    public void removeStone(Stone stone){
        stones.remove(stone);
    }

    public ArrayList<Stone> findStone4color(Color color) {
        ArrayList<Stone> findedStones = new ArrayList<Stone>();
        for (Stone stone:stones) {
            if (stone.getColor() == color)
                findedStones.add((stone));
        }
        return findedStones;
    }

    public ArrayList<Stone> findStone4clarity(double beginClarity, double endClarity){
        ArrayList<Stone> findedStones = new ArrayList<Stone>();
        for (Stone stone:stones) {
            if (stone.getClarity() >= beginClarity && stone.getClarity() <= endClarity)
                findedStones.add((stone));
        }
        return findedStones;
    }

    public ArrayList<Stone> findCutedStone(){
        ArrayList<Stone> findedStones = new ArrayList<Stone>();
        for (Stone stone:stones) {
            if (stone.isCut())
                findedStones.add((stone));
        }
        return findedStones;
    }

    public ArrayList<Stone> findStone4caratWeight(double beginCaratWeight, double endCaratWeight){
        ArrayList<Stone> findedStones = new ArrayList<Stone>();
        for (Stone stone:stones) {
            if (stone.getCaratWeight() >= beginCaratWeight && stone.getCaratWeight() <= endCaratWeight)
                findedStones.add((stone));
        }
        return findedStones;
    }

    public ArrayList<Stone> findStone4cost(double beginCost, double endCost){
        ArrayList<Stone> findedStones = new ArrayList<Stone>();
        for (Stone stone:stones) {
            if (stone.cost() >= beginCost && stone.cost() <= endCost)
                findedStones.add((stone));
        }
        return findedStones;
    }

    public double cost(){
        double cost = 0.0;
        for (Stone stone:stones) {
            cost += stone.cost();
        }
        return cost;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stone> getStones() {
        return stones;
    }
    public void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public Necklace(String name){
        this.name = name;
        this.stones = new ArrayList<Stone>();
    }
    public Necklace(String name, ArrayList<Stone> stones){
        this.name = name;
        this.stones = stones;
    }
}