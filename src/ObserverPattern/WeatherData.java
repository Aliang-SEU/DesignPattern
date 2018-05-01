package ObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private double temperature;
    private double huminity;

    public WeatherData(){

    }

    public double getTemperature() {
        return temperature;
    }

    public double getHuminity() {
        return huminity;
    }
}
