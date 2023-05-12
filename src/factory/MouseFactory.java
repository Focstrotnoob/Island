package factory;

import model.*;

public class MouseFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Mouse(name));
    }

}
