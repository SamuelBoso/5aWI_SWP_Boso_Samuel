package at.samuel.basics.bank_konto;

public class main {
    public static void main(String[] args) {
        Sparbuch Sparbuch1 = new Sparbuch(7000); //Sparbuch mit insgesamt 7000 Geld Limit
        Kreditkonto Kreditkonto1 = new Kreditkonto(8000);
        Girokonto Girokonto1 = new Girokonto(9000);
        LändleGirokonto LändleKonto = new LändleGirokonto(4500);

        //Sparbuch
        Sparbuch1.disburse(5000);
        Sparbuch1.deposit(4000);
        Sparbuch1.disburse(7000); //Test => es sollte die Meldung kommen, dass nicht genügend Geld auf dem Konto ist

        //Kreditkonto
        Kreditkonto1.disburse(5000);
        Kreditkonto1.deposit(4000);
        Sparbuch1.disburse(7000); //Test => es sollte die Meldung kommen, dass abgehoben werden konnte

        //Girokonto
        Girokonto1.disburse(7000);
        Girokonto1.deposit(5000);
        Girokonto1.disburse(9000); //Test => es sollte die Meldung kommen, dass nicht genügend Geld auf dem Konto ist

        //Ländlekonto
        Kreditkonto1.disburse(300);
        Kreditkonto1.deposit(50000);
        Sparbuch1.disburse(10000); //Test => es sollte die Meldung kommen, dass abgehoben werden konnte


    }
}
