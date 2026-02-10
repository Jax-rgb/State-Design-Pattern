public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // Starts as active
        myAccount.activate(); // "Account is already activated!"
        myAccount.suspend(); // "Account is suspended!"
        myAccount.activate(); // "Account is activated!"
        myAccount.deposit(1000.0); // Updates balance and prints toString()
        myAccount.withdraw(100.0); // Updates balance and prints toString()
        myAccount.close(); // "Account is closed!"
        myAccount.activate(); // "You cannot activate a closed account!"
        myAccount.suspend(); // "You cannot suspend a closed account!"
        myAccount.withdraw(500.0); // "You cannot withdraw on a closed account!" + toString()
        myAccount.deposit(1000.0); // "You cannot deposit on a closed account!" + toString()
    }
}
