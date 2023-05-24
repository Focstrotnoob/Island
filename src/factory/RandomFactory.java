package factory;

import model.ResidentsOfTheIsland;

import java.util.Random;

public class RandomFactory implements ResidentsOfTheIslandFactory {
    ResidentsOfTheIslandFactory[] factories;
    Random r = new Random();

    public RandomFactory(ResidentsOfTheIslandFactory[] factories) {
        this.factories = factories;
    }

    @Override
    public ResidentsOfTheIsland create(String name) {
        int ind = r.nextInt(factories.length);
        return factories[ind].create(name);
    }
}
