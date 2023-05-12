package model;

public class Rabbit extends Herbivore{
    private double health = 0.45;
    final static double WEIGHT = 2.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 150;

    public Rabbit(String name) {
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
