package model;

public class Boar extends Herbivore{
    private double health = 50.0;
    final static double WEIGHT = 400.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 50;

    public Boar(String name) {
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
