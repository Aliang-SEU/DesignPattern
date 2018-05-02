package ObserverPattern.Observable;

import java.util.Observable;

public class WeatherData extends Observable {
    //被观察者的私有数据
    private double temperature;
    private double humidity;
    private double pressure;

    //构造函数
    public WeatherData(){}

    /*
        设置测量的数据并通知对应的观察者
     */
    public void setMeasurement(double temperature, double humidity, double pressure){
        this.setChanged();
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }
}
