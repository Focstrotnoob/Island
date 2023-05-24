package factory;

import model.*;
import resources.PropsUtil;

import java.util.Random;

public class RabbitFactory implements ResidentsOfTheIslandFactory {
    Random r = new Random();
    @Override
    public ResidentsOfTheIsland create(String name) {
        return new Rabbit(r.nextInt(PropsUtil.SIDE_X) + 1, r.nextInt(PropsUtil.SIDE_Y) + 1, name);
    }

}
