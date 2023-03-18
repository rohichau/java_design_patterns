package AbstractFactory;

// Each payments bank can have their own style of creating a user and can follow different business logics
// and checks
public class PaytmPaymentsBank extends PaymentsBank {

    PaytmPaymentsBank( /*UserFactory userFactory,*/UserDTO user) {
        super(/*userFactory,*/user);
    }

    @Override
    public User createUser(UserType type, UserDTO userDTO) {
        switch (type) {
            case wallet:
                return new PaytmWalletUser(userDTO.getName(), userDTO.getAge(), userDTO.getOccupation());
            case sba:
                return new SbaUser(userDTO.getName(), userDTO.getAge(), userDTO.getOccupation());
            case vkyc:
                return new VkycUser(userDTO.getName(), userDTO.getAge(), userDTO.getOccupation());
            default:
                return new WalletUser(userDTO.getName(), userDTO.getAge(), userDTO.getOccupation());
    
            }
    }
    
}
