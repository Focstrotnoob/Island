package model;

public class Goat extends Herbivore{
    private double health = 10.0;
    final static double WEIGHT = 60.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 140;

    public Goat(String name) {
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
