package factory;

import model.*;

public class BuffloFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Buffalo(name));
    }

}
