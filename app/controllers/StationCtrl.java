package controllers;

import models.Member;
import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;

import java.util.List;

public class StationCtrl extends Controller
{
    public static void index(Long id)
    {
        Station station = Station.findById(id);
        Logger.info ("Station id = " + station.name);
        Member member = Accounts.getLoggedInMember();
        List<Station> stations = member.stations;
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
        Member member = Accounts.getLoggedInMember();
        member.stations.remove(station);
        member.save();
        station.delete();
        redirect ("/dashboard");
    }

    public static void addStation (String name, double latitude, double longitude)
    {
        Station station = new Station (name, latitude, longitude);
        Logger.info ("Adding a new Station " + name);
        Member member = Accounts.getLoggedInMember();
        member.stations.add(station);
        member.save();
        redirect ("/dashboard");
    }
}