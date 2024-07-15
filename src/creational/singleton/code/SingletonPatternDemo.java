package creational.singleton.code;

import creational.singleton.code.object.LazySingleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        LazySingleton object = LazySingleton.getInstance();
        object.sayHello();
    }

}
