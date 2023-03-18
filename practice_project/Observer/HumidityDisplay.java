package Observer;

public class HumidityDisplay implements Observer {

    String humidity;
    String temp;
    public String getTemp() {
        return temp;
    }
    public void setTemp(String temp) {
        this.temp = temp;
    }
    @Override
    public void display() {
        System.out.println("The humidity now is: " + humidity);
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    @Override
    public void change(String temp, String humid) {
       setHumidity(humid);
       setTemp(temp);
    }
    
}
