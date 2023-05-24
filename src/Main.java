import model.*;
import factory.*;
import resources.PropsUtil;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        RandomFactory rf = new RandomFactory(new ResidentsOfTheIslandFactory[]{
                new BearFactory(),
                new BoarFactory(),
                new BuffloFactory(),
                new CaterpillarFactory(),
                new DeerFactory()
        });

        GameField.gameFieldInit(PropsUtil.SIDE_X, PropsUtil.SIDE_Y);
        EatingLogic.fillChanceEating();

        //EatingLogic.chanceEating.forEach((k, v) -> System.out.println("Key: "+ k  + " "+ "Value: " + v));


        Bear bear = new Bear(20, 20, "bear23");
        Deer deer = new Deer(20,20, "deer23");
        Plants plants = new Plants(20, 20, "plants1");
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();
        bear.move();

        System.out.println(bear);
        bear.eat(deer);
        System.out.println(bear);
        System.out.println(bear.reproduction());









//        System.out.println(bear);
//
//        for(Map.Entry<String, Cell> pair : GameField.field.entrySet())
//        {
//            Cell value = pair.getValue();
//            System.out.print(value);
//        }











    }
}