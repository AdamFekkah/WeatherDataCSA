import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void cleanData(double lower, double upper) {
        ArrayList<Double> cleaned = new ArrayList<>();
        for (Double temp : temperatures) {
            if (temp >= lower && temp <= upper) {
                cleaned.add(temp);
            }
        }
        temperatures = cleaned;
    }

    public int longestHeatWave(double threshold) {
        int max = 0;
        int current = 0;
        for (Double temp : temperatures) {
            if (temp > threshold) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        return max;
    }
}
