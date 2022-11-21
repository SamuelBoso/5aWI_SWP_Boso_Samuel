package at.samuel.basics.Rechner;

public class BaseCalc {

    public void addition(Double number1, Double number2){
        Double result = number1 + number2;
        System.out.println(result);
    }
    public void subtraktion(Double number1, Double number2){
        Double result = number1 - number2;
        System.out.println(result);
    }
    public void multiplication(Double number1, Double number2){
        Double result = number1 * number2;
        System.out.println(result);
    }
    public void division(Double number1, Double number2) {
        if (number2 == 0) {
            System.out.println("Man kann nicht durch 0 teilen. Bitte geben Sie eine andere Zahl ein!");
        } else {
            Double result = number1 / number2;
            System.out.println(result);
        }
    }

}
