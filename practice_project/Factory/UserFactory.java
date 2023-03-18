package Factory;

public class UserFactory {
    public User createUser(UserType type, String name, String age, String occupation) {
        switch (type) {
        case wallet:
            return new WalletUser(name, age, occupation);
        case sba:
            return new SbaUser(name, age, occupation);
        case vkyc:
            return new VkycUser(name, age, occupation);
        default:
            return new WalletUser(name, age, occupation);

        }
    }
}
