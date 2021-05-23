package utils;

import models.Reading;
import services.LatestCalculator;

import java.util.List;

public class StationAnalytics {

    public static Reading getLatestReading(List<Reading> readings) {
        Reading latestReading = null;
        if (readings.size() > 0) {
            latestReading = readings.get(0);
            for (Reading reading : readings) {
                if (reading.temperature < latestReading.temperature) {
                    latestReading = reading;
                }
            }
        }
        return latestReading;
    }

    public static double getLatestTemperatureC(List<Reading> readings) {
        Double latestTemperatureC = null;
        if (readings.size() > 0) {
            latestTemperatureC = readings.get(readings.size() - 1).temperature;
        }
        return latestTemperatureC;
    }

    public static double getLatestTemperatureF(List<Reading> readings) {
        Double latestTemperatureF = null;
        if (readings.size() > 0) {
            Reading lastReading = readings.get(readings.size() - 1);
            double latestTemperatureC = lastReading.temperature;
            latestTemperatureF = LatestCalculator.latestTemperatureF(latestTemperatureC);
            System.out.println("Latest TemperatureF is: " + latestTemperatureF);
        }
        return latestTemperatureF;
    }

    public static double getLatestPressure(List<Reading> readings) {
        Double latestPressure = null;
        if (readings.size() > 0) {
            latestPressure = readings.get(readings.size() - 1).pressure;
        }
        return latestPressure;
    }
    public static double getLatestWindSpeed(List<Reading> readings) {
        Double latestWindSpeed = null;
        if (readings.size() > 0) {
            latestWindSpeed = readings.get(readings.size() - 1).windSpeed;
        }
        return latestWindSpeed;
    }
}
