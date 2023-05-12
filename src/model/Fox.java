package model;

public class Fox extends Predator{
    private double health = 2.0;
    final static double WEIGHT = 8.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 30;

    public Fox(String name) {
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
