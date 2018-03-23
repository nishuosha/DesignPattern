package ObservePattern;


// 观察者的具体实现
public class WeatherData implements Observer {

    private String name;
    private String message;

    public WeatherData(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        print();
    }

    public void print() {
        System.out.println(name + " " + message);
    }
}
