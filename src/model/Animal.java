package model;

public abstract class Animal extends ResidentsOfTheIsland{
    double health;
    double weight;
    int maxAnimalOnOneArea;

    public Animal(String name) {
        super(name);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxAnimalOnOneArea() {
        return maxAnimalOnOneArea;
    }


    public abstract void eat(ResidentsOfTheIsland residentsOfTheIsland);

    public void move(){
        System.out.println("Move");
    }

    public void reproduction(){
        System.out.println("Offspring were born");
    }

    public void death(){
        System.out.println("The animal died");
    }

}
