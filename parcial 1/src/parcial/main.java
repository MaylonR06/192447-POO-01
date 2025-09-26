package parcial;
public class main {
    public class Main {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount("123456789", 1000.0);
        cuenta1.showBalance();
        cuenta1.deposit(500.0);
        cuenta1.showBalance();
        cuenta1.withdraw(200.0);
        cuenta1.showBalance();
        cuenta1.withdraw(1500.0);
        cuenta1.showBalance();
    }
}
 
    }


    

