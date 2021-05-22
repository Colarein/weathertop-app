package controllers;
import java.util.ArrayList;
import java.util.List;
import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;

public class Dashboard extends Controller
{
  public static void index(Long id) {
    Logger.info("Rendering Admin");
    List<Station> stations = Station.findAll();
    System.out.println(stations);
    render ("dashboard.html", stations);
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
