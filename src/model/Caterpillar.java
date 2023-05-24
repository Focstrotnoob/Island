package model;

import java.util.Random;

public class Caterpillar extends Herbivore{

    final static double WEIGHT = 0.01;
    final static int MAX_ANIMAL_ON_ONE_AREA = 1000;

    public Caterpillar(int x, int y, String name) {
        super(x, y, name);
    }

    public String getAnimalType(){
        String animalType = "caterpillar";
        return animalType;
    }

    @Override
    public double getHealth() {
        return 0.0;
    }
    @Override
    public void setHealth(double health) {}
    @Override
    public double getWeight() {
        return WEIGHT;
    }
    @Override
    public int getMaxAnimalOnOneArea() {
        return MAX_ANIMAL_ON_ONE_AREA;
    }

    public Bear reproduction(){
        Random r = new Random();
        return new Bear(this.getX(), this.getY(), "Descendant of the " + this.getName());
    }

    @Override
    public String toString() {
        return "\uD83D\uDC1B" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
