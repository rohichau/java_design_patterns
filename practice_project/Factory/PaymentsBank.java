package Factory;

public class PaymentsBank {

    static UserFactory userFactory;
    static UserDTO userDTO;

    PaymentsBank(UserFactory factory, UserDTO user) {
        userFactory = factory;
        userDTO = user;
    }

    public User getUserDetails(UserType type) {
        return userFactory.createUser(type, userDTO.getName(), userDTO.getAge(), userDTO.getOccupation());
    }

}
