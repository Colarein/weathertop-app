package controllers;
import java.util.List;

import services.LatestCalculator;
import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller {
  public static void index(Long id) {
    Logger.info("Rendering Admin");
    List<Station> stations = Station.findAll();

    for (Station station : stations) {
      List<Reading> readings = station.readings;
      if (readings.size() > 0) {
        Reading latestReading = readings.get(readings.size() - 1);
        station.latestTemperatureC = latestReading.temperature;
        station.latestTemperatureF = LatestCalculator.latestTemperatureF(latestReading.temperature);
        station.latestPressure = latestReading.pressure;
        station.latestWindSpeed = latestReading.windSpeed;
      }
    }
        render("dashboard.html", stations);
  }
}