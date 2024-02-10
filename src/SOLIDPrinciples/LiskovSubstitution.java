package SOLIDPrinciples;


import java.util.ArrayList;
import java.util.List;

class Vehicle{

    public int noOfWheels(){
        return 2;
    }
}

class EngineVehicle extends Vehicle {
     public Boolean hasEngine(){
         return true;
     }
}

class Bicycle extends Vehicle{

}

class Motorcycle extends EngineVehicle{

}

class Car extends EngineVehicle{
     @Override
     public int noOfWheels(){
         return 4;
     }
}

public class LiskovSubstitution {
    public static void main(String[] args){

        List<EngineVehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Car());

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new EngineVehicle());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.noOfWheels());
            System.out.println(vehicle.noOfWheels());
        }

        for(EngineVehicle engineVehicle : vehicleList){
            System.out.println(engineVehicle.hasEngine().toString());
            System.out.println(engineVehicle.noOfWheels());
        }
    }
}
