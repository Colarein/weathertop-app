package utils;

import models.Reading;

import java.util.List;

public class StationAnalytics {

//    public static Reading getLatestReading(List <Reading> readings) {
//        Reading latestReading = null;
//        if (readings.size() > 0) {
//            latestReading = readings.get(0);
//            for (Reading reading : readings) {
//                if (reading.temperature < latestReading.temperature) {
//                    latestReading = reading;
//                }
//            }
//        }
//        return latestReading;
//    }

    public static Double getLatestTemperatureC(List<Reading> readings) {
        Double latestTemperatureC = null;
        if (readings.size() > 0) {
            latestTemperatureC = readings.get(readings.size() - 1).temperature;
        }
        return latestTemperatureC;
    }
}
