package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity

public class Station extends Model
{
  public String name;
  public double latitude;
  public double longitude;

  @OneToMany(cascade = CascadeType.ALL)
  public List <Reading> readings = new ArrayList<Reading>();

  public double latestTemperatureC;
  public double latestTemperatureF;
  public double latestPressure;
  public double latestWindSpeed;
  public String windCompass;
  public double windChill;
  public String beaufortConversion;
  public int latestCode;
  public String weatherDescription;


  public Station(String name, double latitude, double longitude)
  {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }
}
