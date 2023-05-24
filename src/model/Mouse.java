package model;

import java.util.concurrent.ThreadLocalRandom;

public class Mouse extends Herbivore {
    private double health = 0.01;
    final static double WEIGHT = 0.05;
    final static int MAX_ANIMAL_ON_ONE_AREA = 500;

    public Mouse(int x, int y, String name) {
        super(x, y, name);
    }

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

    public void move() {
        int r = ThreadLocalRandom.current().nextInt(1, 2);
        super.move(r);
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0) {
            this.death("died of starvation");
        }
    }

    public void eat() {
        // needed override
    }

    @Override
    public String toString() {
        return "\uD83D\uDC01" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }

}
