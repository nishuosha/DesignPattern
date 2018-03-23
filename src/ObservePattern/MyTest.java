package ObservePattern;


//测试
public class MyTest {

    public static void main(String[] args) {

        Weather w = new Weather();
        Observer o1 = new WeatherData("o1");
        Observer o2 = new WeatherData("o2");
        Observer o3 = new WeatherData("o3");

        w.registerObserver(o1);
        w.registerObserver(o2);
        w.registerObserver(o3);

        w.setInfo("test");

        w.removeObserver(o1);
        w.setInfo("test1");

        Observer o4 = new WeatherData("o4");
        w.registerObserver(o4);
        w.setInfo("test2");

    }
}
