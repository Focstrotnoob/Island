package model;

import exception.InvalidCoordinateException;
import resources.PropsUtil;

import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends ResidentsOfTheIsland {
    private String name;
    private int x;
    private int y;
    private boolean isAlive;

    public Animal(int x, int y, String name) {
        if (x <= PropsUtil.SIDE_X && y <= PropsUtil.SIDE_Y) {
            this.x = x;
            this.y = y;
            this.name = name;
        } else throw new InvalidCoordinateException("Вы вышли за пределы игрового поля при создании животного " + name);
    }

    public abstract String getAnimalType();

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

    public abstract int getNumbSteps();

    public abstract boolean getIsAlive();

    abstract void setIsAlive(boolean m);

    public synchronized void move(int m) {
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
                if ((x + m) < PropsUtil.SIDE_X) {
                    moveDown(m);
                    break;
                }
            } else if (r == 4) {
                if ((y + m) < PropsUtil.SIDE_Y + 1) {
                    moveRight(m);
                    break;
                }
            } else break;
        }
        this.setHealth(getHealth() - (this.getMaxHealth() / 10));
        if (getHealth() <= 0) {
                this.death("died of starvation");
        }
    }

    public void moveUp(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.x = x - m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getAnimalType() + this.getName()  + " moved up at " + m + " cell(s)" + " Health=" + String.format("%.3f", this. getHealth()));
    }

    public void moveDown(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.x = x + m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getAnimalType() + this.getName()  + " moved down at " + m + " cell(s)" + " Health=" + String.format("%.3f", this. getHealth()));
    }

    public void moveLeft(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.y = y - m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getAnimalType() + this.getName()  + " moved left at " + m + " cell(s)" + " Health=" + String.format("%.3f", this. getHealth()));
    }

    public void moveRight(int m) {
        GameField.field.get(this.getCoordinate()).animals.remove(this);
        this.y = y + m;
        GameField.field.get(this.getCoordinate()).animals.add(this);
        System.out.println("The " + this.getAnimalType() + this.getName() + " moved right at " + m + " cell(s)" + " Health=" + String.format("%.3f", this. getHealth()));
    }

    public void eat(ResidentsOfTheIsland residentsOfTheIsland) {
        int r = ThreadLocalRandom.current().nextInt(1, 101);
        if (r <= EatingLogic.chanceEating.get(this.getAnimalType() + residentsOfTheIsland.getAnimalType())) {
            if (this.getHealth() + residentsOfTheIsland.getWeight() > this.getMaxHealth()) {
                this.setHealth(this.getMaxHealth());
            } else {
                this.setHealth(this.getHealth() + residentsOfTheIsland.getWeight());
            }
            System.out.println(" \uD83C\uDF74 \uD83C\uDF74 \uD83C\uDF74" + this.getAnimalType() + this.getName() + " ate " +residentsOfTheIsland.getAnimalType() + residentsOfTheIsland.getName() + " at coordinate -> " + this.getCoordinate() +" \uD83C\uDF74 \uD83C\uDF74 \uD83C\uDF74");
            residentsOfTheIsland.death("is eaten ");
        } else {
            System.out.println(this.getAnimalType() + this.getName() + " couldn't eat " + residentsOfTheIsland.getAnimalType() + residentsOfTheIsland.getName() + " at coordinate -> " + this.getCoordinate());
        }
    }

    public void reproduction(){
//        String temp;
//        ResidentsOfTheIsland tempAnimal;
//        if(this.getIsAlive()) {
//            for (ResidentsOfTheIsland a:GameField.field.get(this.getCoordinate()).animals) {
//                if (!a.equals(this) && a.getAnimalType().equals(this.getAnimalType())) {
//                    tempAnimal = a;
//                }
//            }
//                temp = switch (getAnimalType()) {
//                    case "bear":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Bear(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "boar":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Boar(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "buffalo":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Buffalo(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "caterpillar":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Caterpillar(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "deer":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Deer(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "duck":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Duck(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "eagle":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Eagle(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "fox":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Fox(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "goat":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Goat(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "horse":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Horse(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "mouse":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Mouse(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "rabbit":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Rabbit(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "sheep":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Sheep(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "snake":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Snake(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    case "wolf":
//                        GameField.field.get(this.getCoordinate()).animals.add(new Wolf(this.getX(), this.getY(), " a child from " + getName() + " and " + a.getName()));
//                    default:
//                        System.out.println("Error");
//                };
//        }

//            for (ResidentsOfTheIsland a:GameField.field.get(this.getCoordinate()).animals) {
//                if (!a.equals(this) && a.getAnimalType().equals(this.getAnimalType())) {
//                    System.out.println(getAnimalType() + getName() + " is reproduction");
//                }
//            }

    }


    public void death(String reasonOfDeath) {
        System.out.println("☠\uFE0F☠\uFE0F☠\uFE0FThe " +this.getAnimalType() + this.getName() + " " + reasonOfDeath + " at coordinate = " + this.getCoordinate()+ "☠\uFE0F☠\uFE0F☠\uFE0F");
        setHealth(0.000);
        setIsAlive(false);
        GameField.field.get(this.getCoordinate()).animals.remove(this);
    }


    @Override
    public synchronized void run() {

        while (this.getIsAlive()) {
            int r = ThreadLocalRandom.current().nextInt(1, 101);
            if (r <= 30) {
                for (ResidentsOfTheIsland a : GameField.field.get(this.getCoordinate()).animals) { // Проверяем начие животных котторых можно сьесть
                    if (EatingLogic.chanceEating.containsKey(this.getAnimalType() + a.getAnimalType())) {
                        this.eat(a);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    }
                }
            } else if (r > 31 && r <= 98) {
                if (this.getHealth() > 0)
                    this.move(this.getNumbSteps());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else if (r > 98){
                reproduction();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        //Thread.currentThread().interrupt();

    }
}
