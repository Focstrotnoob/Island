package factory;

import model.*;

public class SheepFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Sheep(name));
    }

}
