package factory;

import model.*;

public class PlantsFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Plants(name));
    }

}
