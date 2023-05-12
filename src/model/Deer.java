package model;

public class Deer extends Herbivore {
    private double health = 50.0;
    final static double WEIGHT = 300.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 20;

    public Deer(String name) {
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
