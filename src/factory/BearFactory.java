package factory;

import model.*;

public class BearFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Bear(name));
    }
}
