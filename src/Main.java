import model.*;
import factory.*;
import resources.PropsUtil;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RandomFactory rf = new RandomFactory(new ResidentsOfTheIslandFactory[]{
                new BearFactory(),
//                new BoarFactory(),
//                new BuffloFactory(),
//             //   new CaterpillarFactory(),
//                new DeerFactory(),
//                new DuckFactory(),
//                new EagleFactory(),
//                new FoxFactory(),
//                new GoatFactory(),
//                new HorseFactory(),
//                new MouseFactory(),
//              //  new PlantsFactory(),
//                new RabbitFactory(),
//                new SheepFactory(),
//                new SnakeFactory(),
//                new WolfFactory()
        });

        GameField.gameFieldInit(PropsUtil.SIDE_X, PropsUtil.SIDE_Y);// Создается игровое поле
        EatingLogic.fillChanceEating(); // Это инициализируется таблица поеданий
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(PropsUtil.NUM_OF_THREADS);
        ExecutorService executorService1 = Executors.newFixedThreadPool(PropsUtil.NUM_OF_THREADS);
        //System.out.println("Island is Life = " + PropsUtil.islandIsLive());
        ArrayList<ResidentsOfTheIsland> animal = new ArrayList<>(); //это лист в который животные падают чтобы запустить сервис
        for (int i = 0; i < PropsUtil.NUM_OF_ANIMALS; i++) {
            animal.add(rf.create("#" +  + i));
        }
        for (ResidentsOfTheIsland r:animal) {
            GameField.field.get(r.getCoordinate()).animals.add(r);
        }
       // System.out.println("Island is Life = " + PropsUtil.islandIsLive());

        while (true) {
            for (int i = 1; i <= PropsUtil.SIDE_X; i++) {
                for (int j = 1; j <= PropsUtil.SIDE_Y; j++) {
                    for (ResidentsOfTheIsland resident : GameField.field.get(i + "*" + j).animals) {
                        //executorService.scheduleWithFixedDelay(resident, 1, 2, TimeUnit.SECONDS);
                        executorService1.execute(resident);
                    }
                }
            }
            if (!PropsUtil.islandIsLive()) {
                //System.out.println(PropsUtil.islandIsLive());
                executorService1.shutdown();

                try {
                    executorService1.awaitTermination(1000, TimeUnit.MILLISECONDS); //TODO?
                    break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}