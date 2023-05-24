package model;

import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predator {
    private double health = 2.0;
    final static double WEIGHT = 8.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 30;

    public Fox(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "fox";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 2.0;
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
        int r = ThreadLocalRandom.current().nextInt(1, 3);
        super.move(r);
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0) {
            this.death("died of starvation");
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDD8A" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }

}
