package model;

import java.util.Random;

public class Caterpillar extends Herbivore{
    private double health = 0.001;
    final static double WEIGHT = 0.01;
    final static int MAX_ANIMAL_ON_ONE_AREA = 1000;
    private boolean isAlive = true;

    public Caterpillar(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public String getAnimalType(){
        String animalType = "caterpillar";
        return animalType;
    }

    public double getMaxHealth() {
        double maxHealth = 0.001;
        return maxHealth;
    }

    @Override
    public double getHealth() {
        return 0.0;
    }
    @Override
    public void setHealth(double health) {}

    @Override
    public int getNumbSteps() {
        return 0;
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
    public boolean getIsAlive() {
        return isAlive;
    }

    @Override
    public void setIsAlive(boolean m) {
        isAlive = m;
    }

    public void reproduction(){
        GameField.field.get(this.getCoordinate()).animals.add(new Bear(this.getX(), this.getY(), "Descendant of the " + this.getName()));
    }

    @Override
    public String toString() {
        return "\uD83D\uDC1B" + getHealth() + "||Coord=" + this.getCoordinate() + "||" + this.getName();
    }
}
