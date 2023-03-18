package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
    String temp;
    String humidity;
    boolean stormy;

    List<Observer> list;

    WeatherData(){
        this.list = new ArrayList<>();
    }

    public String getTemp() {
        return temp;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public boolean isStormy() {
        return stormy;
    }
    public void setStormy(boolean stormy) {
        this.stormy = stormy;
    }
 
    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
        
    }
    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
        
    }
    @Override
    public void notifyObservers() {
         list.stream().forEach(obs -> obs.change(temp, humidity));
    }

    
}
