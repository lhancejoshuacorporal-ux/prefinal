/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinal;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Engine carEngine = new Engine(150, "Honda4T");
        Car car = new Car(4,"Ford","Toyota",2022,carEngine);
        
        Engine truckEngine = new Engine(400,"Diesel");
        Truck truck = new Truck(5000,"Volvo","FH16",2021,truckEngine);
        
        //Test Car
        System.out.println("car.to String()");
        car.start_engine();
        car.stop_engine();
        
        //Test Truck
        System.out.println("truck, to String()");
        truck.start_engine();
        truck.stop_engine();
                
                
    }


    
}
