package ObserverPattern;

import ObserverPattern.Observable.WeatherData;
import ObserverPattern.Observer.GeneralDisplay;

public class Main {
    public static void main(String[] args){
        WeatherData observer = new WeatherData();
        GeneralDisplay display1 = new GeneralDisplay(observer);
        observer.setMeasurement(30, 20, 20);
    }
}
