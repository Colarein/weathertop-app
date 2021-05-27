package controllers;
import java.util.List;

import models.Member;
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
      System.out.println("Here ya go" + station.readings);
      if (readings.size() > 0) {
        Reading latestReading = readings.get(readings.size() - 1);
        station.latestTemperatureC = latestReading.temperature;
        station.latestTemperatureF = LatestCalculator.latestTemperatureF(latestReading.temperature);
        station.latestPressure = latestReading.pressure;
        station.latestWindSpeed = latestReading.windSpeed;
        station.beaufortConversion = LatestCalculator.beaufortConversion(latestReading.windSpeed);
        station.windCompass = LatestCalculator.windCompass(latestReading.windSpeed);
        station.weatherDescription = LatestCalculator.weatherDescription(latestReading.code);
        station.windChill = LatestCalculator.windChill(latestReading.temperature, latestReading.windSpeed);

      }
    }
        render("dashboard.html", stations);
  }
}