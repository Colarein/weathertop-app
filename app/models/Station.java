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
  @OneToMany(cascade = CascadeType.ALL)
  public List <Reading> readings = new ArrayList<Reading>();

  public double latestTemperatureC;
  public double latestTemperatureF;
  public double latestPressure;
  public double latestWindSpeed;
  public int latestCode;


  public Station(String name)
  {
    this.name = name;
  }
}
