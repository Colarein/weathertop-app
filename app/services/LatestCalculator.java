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
    public static String windCompass(double windDirection){

         if (windDirection >=11.25 || windDirection < 33.75){
            return "NNE";
        }
        else if (windDirection >=33.75 || windDirection < 56.25){
            return "NE";
        }
        else if (windDirection >=56.25 || windDirection < 78.75){
            return "ENE";
        }
        else if (windDirection >=78.75 || windDirection < 101.25){
            return "E";
        }
        else if (windDirection >=101.25 || windDirection < 123.75){
            return "ESE";
        }
        else if (windDirection >=123.75 || windDirection < 146.25){
            return "SE";
        }
        else if (windDirection >=146.25 || windDirection < 168.75){
            return "SSE";
        }
        else if (windDirection >=168.75 || windDirection < 191.25){
            return "S";
        }
        else if (windDirection >=191.25 || windDirection < 213.75){
            return "SSW";
        }
        else if (windDirection >=213.75 || windDirection < 236.25){
            return "SW";
        }
        else if (windDirection >=236.25 || windDirection < 258.75){
            return "WSW";
        }
        else if (windDirection >=258.75 || windDirection < 281.25){
            return "W";
        }
        else if (windDirection >=281.25 || windDirection < 303.75){
            return "WNW";
        }
        else if (windDirection >=303.75 || windDirection < 326.25){
            return "NW";
        }
        else if (windDirection >=326.25 || windDirection < 348.75){
            return "NNW";
        }
        else{
            return "N";
        }
    }
//    public static double windChill(double latestTemperatureC, double latestWindSpeed)
//    {
//        double windChill;
//        windChill=  (13.12 + 0.6215 latestTemperatureC – 11.37 (latestWindSpeed^0.16) + 0.3965 latestTemperatureC (latestWindSpeed^0.16)
//
//        return windChill;
//    }
}

