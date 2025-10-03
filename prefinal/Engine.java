/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Engine {
    private int horsepower;
    private String fuel_type;
    
    
    public Engine(int horsepower, String fuel_type){
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
         
    }
    public int getHorsepower(){
        return horsepower;
    }
    public void setHorsepower(int horsepower){
        
    }
    public String getFuel_type(){
         return fuel_type;
    }
    public void setFuel_type(String furl_type){
        this.fuel_type = fuel_type;
    }

    @Override
    public String toString() {
        return "Engine [Horsepower=" + horsepower
                + ", Fuel Type=" + fuel_type + "}";
    }
    
    
}
