package factory;

import model.*;
import resources.PropsUtil;

import java.util.Random;

public class RabbitFactory implements ResidentsOfTheIslandFactory {
    Random r = new Random();
    int x = r.nextInt(PropsUtil.SIDE_X) + 1;
    int y = r.nextInt(PropsUtil.SIDE_Y) + 1, name;
    @Override
    public ResidentsOfTheIsland create(String name) {
        return new Rabbit(x, y, name);
    }

}
