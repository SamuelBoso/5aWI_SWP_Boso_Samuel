package at.samuel.basics.bank_konto;

public class Konto {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Es wurden " + amount + " € auf dein Konto eingezahlt! :D");
    }

    public double disburse(double amount){
        this.balance -= amount;
        return amount;
    }
}
