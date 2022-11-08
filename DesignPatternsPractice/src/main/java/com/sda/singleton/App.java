package Singleton;

public class App {
    public static void main(String[] args) {
    EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance);
     LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2);
    }
}
