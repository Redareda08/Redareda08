package exercice4;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
      this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("notify observers");
        for(int i=0; i< observers.size();i++){
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
        measurementChanged();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
        measurementChanged();
    }

    public void setPression(double pressure) {
        this.pressure = pressure;
        notifyObservers();
        measurementChanged();
    }

    public void measurementChanged(){
        DisplayMeasurements m = new StatisticsDisplay();
        m.display();
    }
}
