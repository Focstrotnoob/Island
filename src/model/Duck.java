package model;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivore {
    double health = 0.15;
    final static double WEIGHT = 1.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 200;

    public Duck(int x, int y, String name) {
        super(x, y, name);
    }

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

    public void move() {
        int r = ThreadLocalRandom.current().nextInt(1, 5);
        super.move(r);
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0 ){
            this.death("died of starvation");
        }
    }

    @Override
    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
        // needed override
    }

    @Override
    public String toString() {
        return "\uD83E\uDD86" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
