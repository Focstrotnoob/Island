package model;

import java.util.HashMap;

public class EatingLogic {
    public static HashMap<String,Integer> chanceEating = new HashMap<>();

    public static void fillChanceEating(){
        chanceEating.put("wolf" + "horse", 10);
        chanceEating.put("wolf" + "deer", 15);
        chanceEating.put("wolf" + "rabbit", 60);
        chanceEating.put("wolf" + "mouse", 80);
        chanceEating.put("wolf" + "goat", 60);
        chanceEating.put("wolf" + "sheep", 70);
        chanceEating.put("wolf" + "boar", 15);
        chanceEating.put("wolf" + "buffalo", 10);
        chanceEating.put("wolf" + "duck", 40);

        chanceEating.put("snake" + "fox", 15);
        chanceEating.put("snake" + "rabbit", 20);
        chanceEating.put("snake" + "mouse", 40);
        chanceEating.put("snake" + "duck", 10);

        chanceEating.put("fox" + "rabbit", 70);
        chanceEating.put("fox" + "mouse", 90);
        chanceEating.put("fox" + "duck", 60);
        chanceEating.put("fox" + "caterpillar", 40);

        chanceEating.put("bear" + "snake", 80);
        chanceEating.put("bear" + "horse", 40);
        chanceEating.put("bear" + "deer", 80);
        chanceEating.put("bear" + "rabbit", 80);
        chanceEating.put("bear" + "mouse", 90);
        chanceEating.put("bear" + "goat", 70);
        chanceEating.put("bear" + "sheep", 70);
        chanceEating.put("bear" + "boar", 50);
        chanceEating.put("bear" + "buffalo", 20);
        chanceEating.put("bear" + "duck", 10);

        chanceEating.put("eagle" + "fox", 10);
        chanceEating.put("eagle" + "rabbit", 90);
        chanceEating.put("eagle" + "mouse", 90);
        chanceEating.put("eagle" + "duck", 80);

        chanceEating.put("horse" + "plants", 100);
        chanceEating.put("deer" + "plants", 100);
        chanceEating.put("rabbit" + "plants", 100);
        chanceEating.put("goat" + "plants", 100);
        chanceEating.put("sheep" + "plants", 100);
        chanceEating.put("buffalo" + "plats", 100);
        chanceEating.put("caterpillar" + "plats", 100);

        chanceEating.put("mouse" + "plats", 100);
        chanceEating.put("mouse" + "caterpillar", 90);

        chanceEating.put("boar" + "plats", 100);
        chanceEating.put("boar" + "mouse", 50);
        chanceEating.put("boar" + "caterpillar", 90);

        chanceEating.put("duck" + "plats", 100);
        chanceEating.put("duck" + "caterpillar", 100);













    }




}
