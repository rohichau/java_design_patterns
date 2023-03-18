package AbstractFactory;

public class UserDTO {

    String name;
    String age;
    String occupation;

    public UserDTO(String name,String age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public String getOccupation() {
        return this.occupation;
    }

}
