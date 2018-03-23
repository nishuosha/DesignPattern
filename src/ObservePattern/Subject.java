package ObservePattern;

//主体接口，通常包含下面三个方法
public interface Subject {

    //添加观察者
    public void registerObserver(Observer o);

    //删除观察者
    public void removeObserver(Observer o);

    //通知观察者
    public void notifyObservers();

}
