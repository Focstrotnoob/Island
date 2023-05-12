package model;

public class Buffalo extends Herbivore{
    private double health = 100.0;
    final static double WEIGHT = 700.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 10;

    public Buffalo(String name) {
        super(name);
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
    public void eat() {
    }
}
