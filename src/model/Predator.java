package model;

import exception.InvalidEatingException;

public abstract class Predator extends Animal{
    public Predator(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("bear");
    }
    @Override
    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
        if (residentsOfTheIsland instanceof Animal){
            System.out.println(this.getClass() + " eating animal" );
            ((Animal) residentsOfTheIsland).death();
        }
        else {
            throw new InvalidEatingException("Хищники не могу есть растения");
        }
    }
    public void move(){
        System.out.println("Move");
    }
    public void death(){
        System.out.println("The animal died");
    }


}
