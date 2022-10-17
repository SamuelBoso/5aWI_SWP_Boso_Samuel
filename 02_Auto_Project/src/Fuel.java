public class Fuel {
    private int fuelConsumption; //Verbrauch pro 100km
    private int fuelAmount;
    private int currentfuelamount;
    private int remainingrange;


    public Fuel(int fuelConsumption, int fuelAmount) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }

    public void drive(){
        if(currentfuelamount == 0){
            this.currentfuelamount = this.fuelAmount - fuelConsumption;
        }else {
            this.currentfuelamount = this.currentfuelamount - fuelConsumption;
        }
    }


    public void turboBoost(){
        if(currentfuelamount == 0)
            if(this.fuelAmount*0.1 < fuelAmount) {
                System.out.println("SuperBoostMode");
            }else{
                System.out.println("Not enough fuel to go to Superboost");
            }
        else{
            if(this.fuelAmount*0.1 < currentfuelamount) {
                System.out.println("SuperBoostMode");
            }else{
                System.out.println("Not enough fuel to go to Superboost");
            }
        }
    }
    public void getRemainingRange(){
        if(currentfuelamount == 0){
            this.remainingrange = this.fuelAmount / this.fuelConsumption * 100;
            System.out.println(remainingrange);
        }else {
            this.remainingrange = this.currentfuelamount / this.fuelConsumption * 100;
            System.out.println(remainingrange);
        }
    }

}
