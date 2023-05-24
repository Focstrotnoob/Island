package model;

import java.util.concurrent.ThreadLocalRandom;

public abstract class ResidentsOfTheIsland implements Runnable {
//    private String name;
//    protected int x;
//    protected int y;
//
//    private double health;
//
//    public double getHealth() {
//        return health;
//    }
//
//    public void setHealth(double health) {
//        this.health = health;
//    }
//
//    public ResidentsOfTheIsland(int x, int y, String name) {
//        this.x = x;
//        this.y = y;
//        this.name = name;
//    }

//    public String getCoordinate() {
//        return x + "*" + y;
//    }
//
//    public void setCoordinate(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

//    public void move(int m) {
//        while (true) {
//            int r = ThreadLocalRandom.current().nextInt(1, 5);
//            if (r == 1) {
//                if (x - m > 0) {
//                    moveUp(m);
//                    break;
//                }
//            } else if (r == 2) {
//                if ((y - m) >= 1) {
//                    moveLeft(m);
//                    break;
//                }
//            } else if (r == 3){
//                if((x + m) <= 100){
//                    moveDown(m);
//                    break;
//                }
//            } else if (r == 4) {
//                if ((y + m) <= 20){
//                    moveRight(m);
//                    break;
//                }
//            }
//        }
//        this.setHealth(getHealth() - 8.0);
//        if (getHealth() <= 0 ){
//            this.death();
//            System.out.println("Отьехал");
//        }
//    }
//
//    public void moveUp(int m) {
//            GameField.field.get(this.getCoordinate()).animals.remove(this);
//            this.x = x - m;
//            GameField.field.get(this.getCoordinate()).animals.add(this);
//        System.out.println("moveUP");
//    }
//
//    public void moveDown(int m) {
//            GameField.field.get(this.getCoordinate()).animals.remove(this);
//            this.x = x + m;
//            GameField.field.get(this.getCoordinate()).animals.add(this);
//        System.out.println("moveDown");
//
//
//    }
//
//    public void moveLeft(int m) {
//            GameField.field.get(this.getCoordinate()).animals.remove(this);
//            this.y = y - m;
//            GameField.field.get(this.getCoordinate()).animals.add(this);
//        System.out.println("MoveLeft");
//    }
//
//    public void moveRight(int m) {
//            GameField.field.get(this.getCoordinate()).animals.remove(this);
//            this.y = y + m;
//            GameField.field.get(this.getCoordinate()).animals.add(this);
//        System.out.println("MoveRight");
//    }

    @Override
    public void run() {
    }
    public abstract void death(String message);
    public abstract double getWeight();
    public abstract int getMaxAnimalOnOneArea();

    public abstract double getHealth();

    public abstract void setHealth(double health);

    public double getMaxHealth() {
        return 0;
    }
    public String getAnimalType(){
        return "Null";
    }
    public abstract String getName();
}

