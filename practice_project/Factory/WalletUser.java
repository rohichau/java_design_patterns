package Factory;

public class WalletUser implements User {

    public String Name,Age,Occupation;

    WalletUser(String name, String age, String occupation){
        this.Name = name;
        this.Age = age;
        this.Occupation = occupation;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.Name;
    }

    @Override
    public String getAge() {
        // TODO Auto-generated method stub
        return this.Age;
    }

    @Override
    public String getOccupation() {
        // TODO Auto-generated method stub
        return this.Occupation;
    }
    @Override
    public String hello() {
       
        return "Hello from a WalletUser " + this.Name;
    }
    
}
