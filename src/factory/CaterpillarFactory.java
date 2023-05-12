package factory;

import model.*;

public class CaterpillarFactory  implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Caterpillar(name));
    }

}
