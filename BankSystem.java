class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited Rs. " + amount);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew Rs. " + amount);
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    
    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Final Balance: Rs. " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "NIB-001";
        acc1.holderName = "Sita Kumari";
        acc1.balance = 5000.0;

        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = "NIB-002";
        acc2.holderName = "Hari Prasad";
        acc2.balance = 10000.0;

      
        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(500);
        acc2.withdraw(12000); 

       
        System.out.println("\n--- Final Account Status ---");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}