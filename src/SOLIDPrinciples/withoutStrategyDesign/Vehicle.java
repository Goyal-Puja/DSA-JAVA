package SOLIDPrinciples.withoutStrategyDesign;

public class Vehicle {
    public void drive(){
        System.out.println("Normal Drive Capability");
    }

    public static void main(String[] args){
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();
    }
}

