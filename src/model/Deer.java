package model;

import java.util.concurrent.ThreadLocalRandom;

public class Deer extends Herbivore {
    private final String animalType = "deer";
    private double health = 50.0;
    final static double WEIGHT = 300.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 20;

    public Deer(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType(){
        String animalType = "deer";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 50.0;
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
        int r = ThreadLocalRandom.current().nextInt(1, 5);
        super.move(r);
        this.setHealth(getHealth() - (getMaxHealth() / 10));
        if (getHealth() <= 0) {
            this.death("died of starvation");
        }
    }

    @Override
    public String toString() {
        return "\uD83E\uDD8C" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
