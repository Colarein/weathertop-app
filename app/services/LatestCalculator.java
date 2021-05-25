package services;

public class LatestCalculator {

    public static double latestTemperatureF(double latestTemperatureC)
    {
        double latestTemperatureF;
        latestTemperatureF= (latestTemperatureC * 1.8) +32;

        return latestTemperatureF;
    }

    public static double latestWindSpeed(double windSpeed){
        if (windSpeed == 1){
            return 0;
        }
        else if (windSpeed >1 || windSpeed <= 5){
            return 1;
        }
        else if (windSpeed >=6 || windSpeed <= 11){
            return 2;
        }
        else if (windSpeed >=12 || windSpeed <= 19){
            return 3;
        }
        else if (windSpeed >=20 || windSpeed <= 28){
            return 4;
        }
        else if (windSpeed >=29 || windSpeed <= 38){
            return 5;
        }
        else if (windSpeed >=39 || windSpeed <= 49){
            return 6;
        }
        else if (windSpeed >=50 || windSpeed <= 61){
            return 7;
        }
        else if (windSpeed >=62 || windSpeed <= 74){
            return 8;
        }
        else if (windSpeed >=75 || windSpeed <= 88){
            return 9;
        }
        else if (windSpeed >=89 || windSpeed <= 102){
            return 10;
        }
        else{
            return 11;
        }
    }

    public static String weatherDescription (int code)
    {
       if (code == 100) {
           return "100";
       }
       else if(code == 200){
           return "200";
       }
       else if(code == 300){
           return "300";
       }
       else if(code == 400){
           return "400";
       }
       else if(code == 500){
           return "500";
       }
       else if(code == 600){
           return "Smelly";
       }
       else if(code == 700){
           return "700";
       }
       else {
           return "800" ;
       }
    }
}
