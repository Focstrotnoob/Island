package model;

public class Mouse extends Herbivore{
    private double health = 0.01;
    final static double WEIGHT = 0.05;
    final static int MAX_ANIMAL_ON_ONE_AREA = 500;

    public Mouse(String name) {
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
