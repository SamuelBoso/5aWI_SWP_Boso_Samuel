package at.samuel.basics.Lampe;

public class main {
    public static void main(String[] args) {
        Lighelement lighelement1 = new Lighelement("led1","red",40.0,false);
        Lighelement lighelement2 = new Lighelement("led2","blue",50.0,true);

        Lampe Glühlampe = new Lampe("Tischlampe");

        //Erstellung der Glühelementen zu einer Lampe
        Glühlampe.addLightElement(lighelement1);
        Glühlampe.addLightElement(lighelement2);

        //Ausgabe der Glühelementnamen
        Glühlampe.printNamesOfLightElements();

        //Schalte alle Glühelemente ein
        Glühlampe.turnAllOn();

        System.out.println(Glühlampe.getOverallPowerUsage());


    }
}
