package factory;

import model.*;

public class BoarFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Boar(name));
    }

}
