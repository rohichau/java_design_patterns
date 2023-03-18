package Observer;

public class TempDisplay implements Observer{

    String temp;
    String humidity;

    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    @Override
    public void display() {
      System.out.println("Temp now is: " + temp);
    }
        
    
    void setTemp(String val){
        this.temp = val;
    }

    String getTemp(String temp){
       return this.temp;
    }
    @Override
    public void change(String temp, String humid) {
       setHumidity(humid);
       setTemp(temp);
    }
    
}
