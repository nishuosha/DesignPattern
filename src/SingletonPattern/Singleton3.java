package SingletonPattern;

public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return instance;
    }
}

//优点：写法简单，保证了线程安全；
//缺点：不会延迟实例化；