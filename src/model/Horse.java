package model;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Herbivore {
    private double health = 60.0;
    final static double WEIGHT = 400.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 20;

    public Horse(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "horse";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 60.0;
        return maxHealth;
    }


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
        int r = ThreadLocalRandom.current().nextInt(1, 5);
        super.move(r);
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0) {
            this.death("died of starvation");
        }
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
