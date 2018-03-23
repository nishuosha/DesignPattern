package SingletonPattern;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2 () {

    }

    public static synchronized Singleton2 getInstance() {

        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

// 优点：线程安全的；
// 缺点：同步会导致性能降低，因为只有在第一次创建实例时，才会需要同步，一旦实例创建成功之后，就不需要同步了；