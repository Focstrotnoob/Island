package factory;

import model.*;
import resources.PropsUtil;

import java.util.Random;

public class PlantsFactory implements ResidentsOfTheIslandFactory {
    Random r = new Random();
    @Override
    public ResidentsOfTheIsland create(String name) {
        //return new Plants(r.nextInt(10) + 1, r.nextInt(10) + 1, name);
        return new Plants(r.nextInt(PropsUtil.SIDE_X) + 1, r.nextInt(PropsUtil.SIDE_Y) + 1, name);
    }

}
