package model;

public class Snake extends Predator{
    private double health = 3.0;
    final static double WEIGHT = 15.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 30;

    public Snake(String name) {
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
