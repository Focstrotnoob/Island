package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {

    final private int x;
    final private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCoordinate(){
        return x + "*" + y;
    }

    public List<ResidentsOfTheIsland> animals = new CopyOnWriteArrayList<>();


    @Override
    public String toString() {
        return "// animals; " + animals.toString();
    }



}
