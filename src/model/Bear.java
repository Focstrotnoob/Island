package model;

import factory.BearFactory;
import resources.PropsUtil;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {
    private double health = 80.0;
    final static double WEIGHT = 500.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 5;
    final static int MAX_LENGTH_MOVE = 3;
    private boolean isAlive = true;

    public Bear(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public String getAnimalType() {
        String animalType = "bear";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 80.0;
        return maxHealth;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }

    @Override
    public int getMaxAnimalOnOneArea() {
        return MAX_ANIMAL_ON_ONE_AREA;
    }

    @Override
    public int getNumbSteps() {
        int r = ThreadLocalRandom.current().nextInt(1, MAX_LENGTH_MOVE + 1);
        return r;
    }

    @Override
    public synchronized boolean getIsAlive() {
        return isAlive;
    }

    @Override
    public synchronized void setIsAlive(boolean m) {
        isAlive = m;
    }

//    @Override
//    public void reproduction() {
//        super.reproduction();
//        if (getName().equals(" little #1")){
//            System.out.println("the " + getName() + " reproduction");
//            GameField.field.get(this.getCoordinate()).animals.add(new Bear(this.getX(), this.getY(), " little " + getName() + "a") );
//        } else {
//            System.out.println("the " + getName() + " reproduction");
//            GameField.field.get(this.getCoordinate()).animals.add(new Bear(this.getX(), this.getY(), " little " + this.getName()));
//        }
//    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }


}
