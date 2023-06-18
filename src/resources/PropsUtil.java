package resources;

import model.Animal;
import model.Cell;
import model.GameField;
import model.ResidentsOfTheIsland;

public class PropsUtil {

    public static final int SIDE_X = 6;
    public static final int SIDE_Y = 6;
    public static final int NUM_OF_ANIMALS = 5;
    public static final int NUM_OF_THREADS = 10;

    public static boolean islandIsLive(){
        for (int i = 1; i <= SIDE_X ; i++) {
            for (int j = 1; j <= SIDE_Y; j++) {
                if(GameField.field.get(i + "*" + j).animals.size() != 0){
                    return true;
                }
            }
        } return false;
    }

    public static void printIsland(){
        for (int i = 1; i <= SIDE_X ; i++) {
            for (int j = 1; j <= SIDE_Y; j++) {
                System.out.println(GameField.field);
                //System.out.println(GameField.field.get(i + "*" + j).animals);

            }
        }

    }


}
