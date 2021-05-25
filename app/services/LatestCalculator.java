package services;

public class LatestCalculator {

    public static double latestTemperatureF(double latestTemperatureC)
    {
        double latestTemperatureF;
        latestTemperatureF= (latestTemperatureC * 1.8) +32;

        return latestTemperatureF;
    }

    public static String beaufortConversion(double windSpeed){
        if (windSpeed == 1){
            return "Calm";
        }
        else if (windSpeed >1 || windSpeed <= 5){
            return "Light Air";
        }
        else if (windSpeed >=6 || windSpeed <= 11){
            return "Light Breeze";
        }
        else if (windSpeed >=12 || windSpeed <= 19){
            return "Gentle Breeze";
        }
        else if (windSpeed >=20 || windSpeed <= 28){
            return "Moderate Breeze";
        }
        else if (windSpeed >=29 || windSpeed <= 38){
            return "Fresh Breeze";
        }
        else if (windSpeed >=39 || windSpeed <= 49){
            return "Strong Breeze";
        }
        else if (windSpeed >=50 || windSpeed <= 61){
            return "Near Gale";
        }
        else if (windSpeed >=62 || windSpeed <= 74){
            return "Gale";
        }
        else if (windSpeed >=75 || windSpeed <= 88){
            return "Severe Gale";
        }
        else if (windSpeed >=89 || windSpeed <= 102){
            return "Strong Storm";
        }
        else{
            return "Violent Storm";
        }
    }

    public static String weatherDescription (int code)
    {
       if (code == 100) {
           return "Clear";
       }
       else if(code == 200){
           return "Partial Clouds";
       }
       else if(code == 300){
           return "Cloudy";
       }
       else if(code == 400){
           return "Light Showers";
       }
       else if(code == 500){
           return "Heavy Showers";
       }
       else if(code == 600){
           return "Rain";
       }
       else if(code == 700){
           return "Snow";
       }
       else {
           return "Thunder" ;
       }
    }
}
