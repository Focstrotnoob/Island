package model;

import java.util.concurrent.ThreadLocalRandom;

public class Rabbit extends Herbivore {
    private double health = 0.45;
    final static double WEIGHT = 2.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 150;

    public Rabbit(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType() {
        String animalType = "rabbit";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 0.45;
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
        return "\uD83D\uDC11" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
