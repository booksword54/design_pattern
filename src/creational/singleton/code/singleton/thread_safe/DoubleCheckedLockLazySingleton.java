package creational.singleton.code.singleton.thread_safe;

public class DoubleCheckedLockLazySingleton {

    private volatile static DoubleCheckedLockLazySingleton instance;

    private DoubleCheckedLockLazySingleton(){}

    public static DoubleCheckedLockLazySingleton getInstance() {
        if (instance == null) {
            // 防止多线程同时进入造成 instance 被多次实例化
            synchronized (DoubleCheckedLockLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockLazySingleton();
                }
            }
        }
        return instance;
    }

}
