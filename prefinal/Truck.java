/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Truck extends Vehicle {
    
    private int max_load;
    
    public Truck(int max_load, String brand, String model, int year, int engine){
     super(brand, model, year, engine);
    this.max_load = max_load;
    
    }   

    Truck(int i, String volvo, String fH16, int i0, Engine truckEngine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getMax_load(){
        return max_load;
        
    }
    public void setMax_load(int max_olaod){
        this.max_load = max_load;
    }

    @Override
    public void setEngine(String engine) {
        
    }

    @Override
    public void setYear(String year) {
       
    }

    @Override
    public void setModel(String model) {
            }

    @Override
    public void gsetBrand(String brand) {
        
    }

    public Truck(int max_load) {
        this.max_load = max_load;
    }

    void start_engine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void stop_engine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
