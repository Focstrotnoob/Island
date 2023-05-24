package model;

import factory.BearFactory;
import resources.PropsUtil;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {
    private double health = 80.0;
    final static double WEIGHT = 500.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 5;

    public Bear(int x, int y, String name) {
        super(x, y, name);
    }

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

    public void move() {
        int r = ThreadLocalRandom.current().nextInt(1, 4);
        super.move(r);
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0) {
            this.death("died of starvation");
        }
    }

    public Bear reproduction() {
        Random r = new Random();
        return new Bear(this.getX(), this.getY(), "Descendant of the " + this.getName());
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }


}
