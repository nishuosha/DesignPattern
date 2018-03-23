package ObservePattern;

import java.util.ArrayList;
import java.util.List;

//主体接口的实现，具体的应用
public class Weather implements Subject {

    private List<Observer> observers;  //保存所有观察者的list
    private String message; //推送的消息

    public Weather() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty()){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {

        //所有的观察者更新自身状态
        for(Observer o : observers) {
            o.update(message);
        }
        System.out.println();
    }

    //具体的推送方法，里面调用 notify方法，通知观察者
    public void setInfo(String message) {
        this.message = message;
        notifyObservers();
    }
}
