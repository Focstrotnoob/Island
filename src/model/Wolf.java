package model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {
    private double health = 8.0;
    final static double WEIGHT = 50.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 30;

    public Wolf(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "wolf";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 8.0;
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

    @Override
    public String toString() {
        return "\uD83D\uDC3A" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
