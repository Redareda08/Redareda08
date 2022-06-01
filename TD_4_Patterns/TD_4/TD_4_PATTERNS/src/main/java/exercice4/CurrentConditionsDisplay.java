package exercice4;

public class CurrentConditionsDisplay implements Observer,DisplayMeasurements{

    private double temperature;
    private double humidity;
    private double pressure;


    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay has been updated: temp = " +
                temperature + ", pressure = " + pressure + ", humidity = " + humidity);
    }

    @Override
    public void update(double T, double P,double H) {
        this.temperature=T;
        this.pressure=P;
        this.humidity=H;
        display();

    }
}
