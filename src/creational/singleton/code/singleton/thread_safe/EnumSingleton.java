package creational.singleton.code.singleton.thread_safe;

public enum EnumSingleton {
    // 自动支持序列化机制，避免多线程同步问题，防止反序列化重新创建新的对象
    INSTANCE;
}
