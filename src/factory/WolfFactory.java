package factory;

import model.*;

public class WolfFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Wolf(name));
    }

}
