package at.samuel.basics.Rechner;

public class main {
    public static void main(String[] args) {
        ScienceCalc ScienceCalc1 = new ScienceCalc();
        BaseCalc BaseCalc1 = new BaseCalc();
        rootCalc RootCalc1 = new rootCalc();

        //Testen der Methoden
        ScienceCalc1.addition(5.0,7.0);
        BaseCalc1.subtraktion(7.0,6.0);
        RootCalc1.root(5.0);

        //Test von Vererbung
        RootCalc1.subtraktion(8.0,4.0);
        ScienceCalc1.division(20.0,5.0);
        //BaseCalc1.root(); Funktioniert nicht. Richtig!




    }





}
