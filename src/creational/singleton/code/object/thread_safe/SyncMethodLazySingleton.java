package creational.singleton.code.object.thread_safe;

public class SyncMethodLazySingleton {

    private static SyncMethodLazySingleton instance;

    private SyncMethodLazySingleton() {
    }

    public static synchronized SyncMethodLazySingleton getInstance() {
        if (instance == null) {
            instance = new SyncMethodLazySingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("hello");
    }

}
