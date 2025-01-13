import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<>();
        temps.add(90.0);
        temps.add(85.5);
        temps.add(88.0);
        temps.add(92.3);
        temps.add(101.0);
        temps.add(105.5);
        temps.add(99.9);
        temps.add(102.2);
        temps.add(95.0);
        temps.add(100.1);
        
        WeatherData wd = new WeatherData(temps);
        
        wd.cleanData(85.0, 100.0);
        System.out.println(wd.temperatures); // Expected: [90.0, 85.5, 88.0, 92.3, 99.9, 95.0]
        
        System.out.println(wd.longestHeatWave(90.0)); // Expected: 3
    }
}
