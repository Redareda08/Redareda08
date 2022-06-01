package exercice4;

public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer ccd = new CurrentConditionsDisplay();
        wd.registerObserver(ccd);
        wd.setTemperature(10.0);
        wd.setPression(1000.0);
        wd.setHumidity(80.0);
        wd.setTemperature(12.0);
        wd.setPression(1020.0);
        wd.setHumidity(60.0);
    }

}
