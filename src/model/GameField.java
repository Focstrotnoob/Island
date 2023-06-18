package model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GameField {

    static public HashMap<String, Cell> field = new HashMap<>();

    public static void gameFieldInit(int x, int y) {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    field.put(i + "*" + j, new Cell(i, j));
                }
            }
        }

    public static void printValues(HashMap<String, Cell> map)
    {
//        for (Map.Entry<String,Cell> entry: map.entrySet()){
//            for (int i = 0; i < 5; i++) {
//                //System.out.print("Key=" + entry.getKey() + " Value=" + entry.getValue()+ "               ");
//            }
//            System.out.println();
//        }
        for(HashMap.Entry<String, Cell> pair : map.entrySet())
        {

        }
   }

}
