package model;

public class Eagle extends Predator{
    private double health = 1.0;
    final static double WEIGHT = 6.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 20;

    public Eagle(String name) {
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
