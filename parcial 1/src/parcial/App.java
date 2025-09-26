package parcial;

public class App {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount("987654321", 2000.0);
        
        cuenta1.showBalance();
        cuenta1.deposit(300.0);
        cuenta1.withdraw(100.0);
        cuenta1.showBalance();
    }
}

