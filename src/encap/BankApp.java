package encap;

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "Hoysala", 1000);
        System.out.println("Account Number:"+acc.getAccountNumber());
        System.out.println("Account Holder: " + acc.getHolderName());
        System.out.println("Balance: " + acc.getBalance());
    
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); 
    
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
