package Factory;

public class MainClass {
    static PaymentsBank paymentsBank;
    public static void main(String [] args){      
        UserDTO userDTO = extracted();
        paymentsBank = new PaymentsBank(new UserFactory(), userDTO);
        System.out.println(paymentsBank.getUserDetails(UserType.wallet).hello());
    }
    private static UserDTO extracted() {
        return new UserDTO("bulma", "23", "College");
    }
}
