package creational.singleton.code.singleton.thread_safe;

public class InnerStaticClassLazySingleton {

    /**
     * 静态域延迟初始化，实例化 instance 很消耗资源，想让它延迟加载
     * 又不希望在 Singleton 类加载时就实例化，因为 Singleton 类还可能在其他的地方被主动使用而被加载
     * 利用 classloader 机制来保证初始化 instance 时只有一个线程
     */
    private static class SingletonHolder {
        private static final InnerStaticClassLazySingleton INSTANCE = new InnerStaticClassLazySingleton();
    }

    private InnerStaticClassLazySingleton() {}

    public static final InnerStaticClassLazySingleton getInstance() {
        // 显式调用 getInstance 方法时，才会装载 SingletonHolder 类，从而实例化 instance
        return SingletonHolder.INSTANCE;
    }

}
