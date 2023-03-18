package AbstractFactory;

public abstract class PaymentsBank {

    //static UserFactory userFactory;
    static UserDTO userDTO;

    PaymentsBank(/*UserFactory factory,*/ UserDTO user) {
       // userFactory = factory;
        userDTO = user;
    }

    public  User getUserDetails(UserType type)
     {
         
        return createUser(type, userDTO);
    }
    
    // This will allow the subclasses to decide the userFactory to be selected
    public abstract User createUser(UserType type, UserDTO userDTO);
    //userDTO.getName(), userDTO.getAge(), userDTO.getOccupation()

}
