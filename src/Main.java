class BankAccount {
    String owner;
    double startBalance;


    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.startBalance = startBalance;

    }


    public void deposit(double amount) {
        startBalance += amount;


    }
    public void withdraw(double amount) {
        startBalance -= amount;
        if(amount > startBalance){
            System.out.println("Deposit failed");
        }

    }
    public void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + startBalance);

    }

}



public class Main {
    public static void main(String[] args) {
    BankAccount account = new BankAccount("John Doe", 500);
    account.deposit(10);
    account.withdraw(1000);

    account.display();




    }
}