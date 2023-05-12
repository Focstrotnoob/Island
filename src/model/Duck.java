package model;

public class Duck extends Herbivore{
    double health = 0.15;
    final static double WEIGHT = 1.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 200;

    public Duck(String name) {
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
    @Override
    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
    }
}
