package controllers;

import java.util.List;

import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;

public class StationCtrl extends Controller
{
    public static void index(Long id)
    {
        Station station = Station.findById(id);
        //Reading latestReading = StationAnalytics.getLatestReading(station.readings);
        station.latestTemperatureC = StationAnalytics.getLatestTemperatureC(station.readings);
        //station.latestTemperatureC = latestReading.temperature;
        //station.latestTempF = latestReading.temperature * 1.8 + 32 ;
        //station.latestPressure = latestReading.pressure;
        //station.latestWindSpeed = latestReading.windSpeed;

        Logger.info ("Station id = " + id);
        render("station.html", station);
    }

    public static void addReading(Long id, int code, double temperature, double windSpeed, int pressure) {
        Reading reading = new Reading(code, temperature, windSpeed, pressure);
        Station station = Station.findById(id);
        station.readings.add(reading);
        station.save();
        redirect("/stations/" + id);
    }

    public static void deleteReading(Long id, Long readingid) {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingid);
        Logger.info("Removing " + reading.code, reading.temperature, reading.windSpeed, reading.pressure );
        station.readings.remove(reading);
        station.save();
        reading.delete();
        render("station.html", station);
    }
}