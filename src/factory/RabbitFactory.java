package factory;

import model.*;

public class RabbitFactory implements ThreadFactory {
    @Override
    public Thread create(String name) {
        return new Thread(new Rabbit(name));
    }

}
