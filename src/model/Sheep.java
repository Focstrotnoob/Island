package model;

public class Sheep extends Herbivore{
    private double health = 15.0;
    final static double WEIGHT = 70.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 140;

    public Sheep(String name) {
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
