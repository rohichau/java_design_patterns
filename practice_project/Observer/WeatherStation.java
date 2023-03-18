package Observer;

public class WeatherStation {

    static WeatherData weatherData;
   
    public static void main(String args[]){
        weatherData = new WeatherData();
        Observer observer1 = new TempDisplay();
        Observer observer2 = new HumidityDisplay();
        weatherData.registerObserver(observer1);
        weatherData.registerObserver(observer2);
        changeWeatherData("100","99");
        weatherData.notifyObservers();
        display();
        changeWeatherData("99", "60");
        weatherData.notifyObservers();
        display();
        
    }

    public static void changeWeatherData(String temp, String humidity){
       weatherData.setHumidity(humidity);
       weatherData.setTemp(temp);
    }

    public static void display(){
        weatherData.list.stream().forEach(obs -> obs.display());
    }
}
