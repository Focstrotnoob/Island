package model;

import java.util.concurrent.ThreadLocalRandom;

public class Goat extends Herbivore {
    private double health = 10.0;
    final static double WEIGHT = 60.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 140;
    final static int MAX_LENGTH_MOVE = 3;
    private boolean isAlive = true;

    public Goat(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
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

    @Override
    public int getNumbSteps() {
        int r = ThreadLocalRandom.current().nextInt(1, MAX_LENGTH_MOVE + 1);
        return r;
    }

    @Override
    public boolean getIsAlive() {
        return isAlive;
    }

    @Override
    public void setIsAlive(boolean m) {
        isAlive = m;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC10" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
