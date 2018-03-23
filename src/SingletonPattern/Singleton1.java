package SingletonPattern;

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1 () {

    }

    public static Singleton1 getInstance() {

        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

// 优点：延迟实例化；
// 缺点：不是线程安全的，因为当一个线程在创建实例的时候，另一个线程同样会进入if语句，就会创建出另一个实例；