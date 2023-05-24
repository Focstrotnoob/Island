package model;

public class Plants extends ResidentsOfTheIsland {
    private String name;
    private int x;
    private int y;
    static final double HEALTH = 1.0;
    final static double WEIGHT = 1.0;
    final static int MAX_ANIMAL_ON_ONE_AREA = 200;

    public Plants(int x, int y, String plants1) {
        this.name = plants1;
        this.x = x;
        this.y = y;
    }

    public String getAnimalType() {
        String animalType = "plants";
        return animalType;
    }

    @Override
    public double getHealth() {
        return HEALTH;
    }

    @Override
    public void setHealth(double health) {

    }

    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }

    @Override
    public int getMaxAnimalOnOneArea() {
        return MAX_ANIMAL_ON_ONE_AREA;
    }

    public String getCoordinate() {
        return x + "*" + y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void death(String message) {
    }
}
