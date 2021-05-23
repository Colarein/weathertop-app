package services;

public class LatestCalculator {

    public static double latestTemperatureF(double latestTemperatureC)
    {
        double latestTemperatureF;
        latestTemperatureF= (latestTemperatureC * 1.8) +32;

        return latestTemperatureF;
    }
}
