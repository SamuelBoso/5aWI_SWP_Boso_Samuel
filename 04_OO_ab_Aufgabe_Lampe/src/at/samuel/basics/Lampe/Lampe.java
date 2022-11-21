package at.samuel.basics.Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lampe {
    private String name;
    private List<Lighelement> lightelements;


    public Lampe(String name) {
        this.name = name;
        this.lightelements = new ArrayList<Lighelement>();
    }

    public void addLightElement(Lighelement lightelement){
        this.lightelements.add(lightelement);
    }

    public List<Lighelement> getLightelements() {
        return lightelements;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < this.lightelements.size(); i++) {
            System.out.println(this.lightelements.get(i).getName());
        }
    }
    public void turnAllOn(){
        for (int i = 0; i < this.lightelements.size(); i++) {
            this.lightelements.get(i).turnOn();
        }
    }
    public Double getOverallPowerUsage(){
        Double overallpowerusage= 0.0;
            for (int i = 0; i < this.lightelements.size(); i++) {
                overallpowerusage = overallpowerusage + this.lightelements.get(i).getConsumption();
            }
        return overallpowerusage;
    }
}
