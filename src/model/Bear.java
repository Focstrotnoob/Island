package model;

public class Bear extends Predator{
    private String names;
    private double health = 80.0;
    final static double WEIGHT = 500.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 5;

    public Bear(String name) {
        super(name);
    }
    public String getNames() {
        return names;
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
    public String toString() {
        return "Bear{" +
                "health=" + health +
                ", weight=" + weight +
                ", maxAnimalOnOneArea=" + maxAnimalOnOneArea +
                '}';
    }
    public void eat() {
    }
}
