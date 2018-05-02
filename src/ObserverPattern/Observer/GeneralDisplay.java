package ObserverPattern.Observer;

import ObserverPattern.Interface.DisplayElement;
import ObserverPattern.Observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者：实现Observer接口来实现观察者模式
 *
 */
public class GeneralDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private Observable observable;

    /**
     * 设置被观察者，并注册观察者
     * @param observable
     */
    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "GeneralDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
