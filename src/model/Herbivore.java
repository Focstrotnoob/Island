package model;

import exception.InvalidEatingException;

public abstract class Herbivore extends Animal{
    public Herbivore(String name) {
        super(name);
    }
    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
        if (residentsOfTheIsland instanceof Plants){
            System.out.println(this + "eating plant" );
        }
        else {
            throw new InvalidEatingException("Травоядные не могу есть ничего кроме растений");
        }
    }



}
