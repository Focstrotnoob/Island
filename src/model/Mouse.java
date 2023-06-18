package model;

import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Herbivore {
    private double health = 0.01;
    final static double WEIGHT = 0.05;
    final static int MAX_ANIMAL_ON_ONE_AREA = 500;
    final static int MAX_LENGTH_MOVE = 3;
    private boolean isAlive = true;

    public Mouse(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public String getAnimalType() {
        String animalType = "mouse";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 0.01;
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
    public void eat() {
        // needed override
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
        return "\uD83D\uDC01" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }

}
