package model;

import exception.InvalidEatingException;

public abstract class Predator extends Animal{
    public Predator(int x, int y, String name) {
        super(x, y, name);
    }
        // It's class needs for right realize method eat
}
