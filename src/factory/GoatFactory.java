package factory;

import model.*;

public class GoatFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Goat(name));
    }

}
