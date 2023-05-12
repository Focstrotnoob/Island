package factory;

import java.util.Random;

public class RandomFactory implements ThreadFactory{
    ThreadFactory[] factories;
    Random r = new Random();

    public RandomFactory(ThreadFactory[] factories) {
        this.factories = factories;
    }

    @Override
    public Thread create(String name) {
        int ind = r.nextInt(factories.length);
        return factories[ind].create(name);
    }
}
