package factory;

import model.*;

public class EagleFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Eagle(name));
    }

}
