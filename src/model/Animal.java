package model;

import exception.InvalidCoordinateException;
import resources.PropsUtil;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends ResidentsOfTheIsland {
    private String name;
    private int x;
    private int y;
    //this.getClass().getTypeName().substring(this.getClass().getTypeName().lastIndexOf('.'));

    public Animal(int x, int y, String name) {
        if (x <= PropsUtil.SIDE_X && y <= PropsUtil.SIDE_Y) {
            this.x = x;
            this.y = y;
            this.name = name;
        } else throw new InvalidCoordinateException("Вы вышли за пределы игрового поля при создании животного " + name);
    }

    public String getAnimalType() {
        return "Null";
    }

    public abstract double getHealth();

    public abstract void setHealth(double health);

    public String getName() {
        return name;
    }

    public String getCoordinate() {
        return x + "*" + y;
    }

    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int m) {
        while (true) {
            int r = ThreadLocalRandom.current().nextInt(1, 5);
            if (r == 1) {
                if (x - m >= 1) {
                    moveUp(m);
                    break;
                }
            } else if (r == 2) {
                if ((y - m) >= 1) {
                    moveLeft(m);
                    break;
                }
            } else if (r == 3) {
                if ((x + m) <= PropsUtil.SIDE_X) {
                    moveDown(m);
                    break;
                }
            } else if (r == 4) {
                if ((y + m) <= PropsUtil.SIDE_Y) {
                    moveRight(m);
                    break;
                }
            }
        }
    }

    public void moveUp(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.x = x - m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getName() + " moved up at " + m + " cell(s)");
    }

    public void moveDown(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.x = x + m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getName() + " moved down at " + m + " cell(s)");
    }

    public void moveLeft(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.y = y - m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getName() + " moved left at " + m + " cell(s)");
    }

    public void moveRight(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.y = y + m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getName() + " moved right at " + m + " cell(s)");
    }

    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
        int r = ThreadLocalRandom.current().nextInt(1, 101);
        if (r <= EatingLogic.chanceEating.get(this.getAnimalType() + residentsOfTheIsland.getAnimalType())) {
            if (this.getHealth() + residentsOfTheIsland.getWeight() > this.getMaxHealth()) {
                this.setHealth(this.getMaxHealth());
            } else {
                this.setHealth(this.getHealth() + residentsOfTheIsland.getWeight());
            }
            System.out.println(this.getName() + " ate " + residentsOfTheIsland.getName() + " at coordinate -> " + this.getCoordinate());
            residentsOfTheIsland.death("is eaten");
        } else {
            System.out.println(this.getName() + " couldn't eat " + residentsOfTheIsland.getName() + " at coordinate -> " + this.getCoordinate());
        }
    }

    public void death(String reasonOfDeath) {
        System.out.println("The " + this.getName() + " " + reasonOfDeath + " at coordinate = " + this.getCoordinate());
        GameField.field.get(this.getCoordinate()).animals.remove(this);
    }


}
