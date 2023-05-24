package model;

import java.util.concurrent.ThreadLocalRandom;

public class Buffalo extends Herbivore {

    private double health = 100.0;
    final static double WEIGHT = 700.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 10;

    public Buffalo(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "buffalo";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 100.0;
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

    public void eat() {
    }

    @Override
    public String toString() {
        return " \uD83D\uDC17";
    }
}
