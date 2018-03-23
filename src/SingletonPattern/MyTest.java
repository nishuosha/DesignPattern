package SingletonPattern;

public class MyTest {

    private String name;

    public static void main(String[] args) {

        Singleton1 i1 = Singleton1.getInstance();
        Singleton1 i2 = Singleton1.getInstance();
        System.out.println(i1);
        System.out.println(i2);

        Singleton2 i3 = Singleton2.getInstance();
        Singleton2 i4 = Singleton2.getInstance();
        System.out.println(i3);
        System.out.println(i4);

        Singleton3 i5 = Singleton3.getInstance();
        Singleton3 i6 = Singleton3.getInstance();
        System.out.println(i5);
        System.out.println(i6);

        Singleton4 i7 = Singleton4.getInstance();
        Singleton4 i8 = Singleton4.getInstance();
        System.out.println(i7);
        System.out.println(i8);


    }

}
