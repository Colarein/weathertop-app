package controllers;

import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;

public class StationCtrl extends Controller
{
    public static void index(Long id, double latestTemperatureC, double latestTemperatureF, int latestCode)
    {
        Station station = Station.findById(id);
        Logger.info ("Station id = " + id);

        Reading latestReading = StationAnalytics.getLatestReading(station.readings);

        station.latestTemperatureC = StationAnalytics.getLatestTemperatureC(station.readings);
        station.latestTemperatureF = StationAnalytics.getLatestTemperatureF(station.readings);
        station.latestPressure = StationAnalytics.getLatestPressure(station.readings);
        station.latestWindSpeed = StationAnalytics.getLatestWindSpeed(station.readings);
        station.latestCode = StationAnalytics.getLatestCode(station.readings);

        render("station.html", station);
    }

    public static void addReading(Long id, int code, double temperature, int windSpeed, int pressure) {
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

    public static void deleteStation (Long id)
    {
        Station station = Station.findById(id);
        Logger.info ("Removing" + station.name);
        station.delete();
        redirect ("/dashboard");
    }

    public static void addStation (String name)
    {
        Station station = new Station (name);
        Logger.info ("Adding a new Station " + name);
        station.save();
        redirect ("/dashboard");
    }
}