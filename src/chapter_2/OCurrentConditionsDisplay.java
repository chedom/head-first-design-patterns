package chapter_2;

import java.util.Observable;
import java.util.Observer;

public class OCurrentConditionsDisplay  implements Observer, DisplayElement {

    Observable obsorvable;
    private float temperature;
    private float humidity;

    public OCurrentConditionsDisplay(Observable observable) {
        this.obsorvable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof OWeatherData) {
            OWeatherData weatherData = (OWeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + "% humidity");
    }

}
