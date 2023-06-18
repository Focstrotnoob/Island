package model;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivore {
    double health = 0.15;
    final static double WEIGHT = 1.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 200;
    final static int MAX_LENGTH_MOVE = 3;
    private boolean isAlive = true;

    public Duck(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public String getAnimalType() {
        String animalType = "duck";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 0.15;
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

//    @Override
//    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
//        System.out.println("it's method Duck's");
//        // needed override
//    }

    @Override
    public String toString() {
        return "\uD83E\uDD86" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
