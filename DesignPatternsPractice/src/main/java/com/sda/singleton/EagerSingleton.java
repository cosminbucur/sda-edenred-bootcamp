package Singleton;

public class EagerSingleton {
    //eager loading by instantiating the singleton directly from instance variable
    private static final EagerSingleton instance = new EagerSingleton();

    //private constructor to now allow instantiating a new A object
    private EagerSingleton() {
    }

    //method to return the instance
    public static EagerSingleton getInstance() {
        return instance;
    }

}
