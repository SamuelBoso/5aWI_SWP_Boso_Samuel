package at.samuel.basics.bank_konto;

public class Sparbuch extends Konto{
    private int limit;

    public Sparbuch(int limit) {
        this.limit = limit;
    }

    @Override
    public  double disburse(double amount) {
        if ((getBalance() - amount) > (limit * -1)) {
            System.out.println("Disburse " + amount + " Euros");
            return super.disburse(amount);
        } else {
            System.out.println("Nicht genügend Geld zum abnehmen auf dem Konto. Warte auf deine nächste Einzahlung! :)");
            return 0;
        }
    }
}
