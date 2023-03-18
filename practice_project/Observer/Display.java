package Observer;

public class Display {

    WeatherData weatherData;
    
    Display(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    void displayTemp(){
        System.out.println("The current temperature is: " + weatherData.temp);
    }

    void displayHumidity(){
        System.out.println("The current humidity level is: " + weatherData.humidity);
    }

    void isStormy(){
          System.out.println(weatherData.isStormy()?"The weather is stormy":"The weather is calm");
    }
}
