package model;

import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Herbivore {
    private double health = 10.0;
    final static double WEIGHT = 60.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 140;

    public Goat(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "goat";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 10.0;
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
        return "\uD83D\uDC10" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
