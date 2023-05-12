package factory;

import model.*;

public class DeerFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Deer(name));
    }

}
