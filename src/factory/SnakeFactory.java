package factory;

import model.*;

public class SnakeFactory  implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Snake(name));
    }

}
