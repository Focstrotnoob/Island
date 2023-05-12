package factory;

import model.*;

public class FoxFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Fox(name));
    }

}
