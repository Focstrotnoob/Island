package factory;

import model.*;

public class HorseFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Horse(name));
    }

}
