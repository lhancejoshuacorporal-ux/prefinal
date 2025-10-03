/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Car extends Vihecle{
    
    private int num_doors;
    
    public Car(int num_doors, String brand, String model, int year, Engine engine){
        super(brand, model, year, engine);
        this.num_doors = num_doors;
               
    }
    public int getNum_doors(){
        return num_doors;
    }
    public void setNum_doors(int num_doors){
        this.num_doors = num_doors;
    }

    void start_engine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void stop_engine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }

    
    
    
    
   
    

