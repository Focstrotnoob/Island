package factory;

import model.*;

public class DuckFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Duck(name));
    }

}
