package SOLIDPrinciples.withStrategyDesign;

public class VehicleClass {
    DriveStrategy driveStrategy;

    VehicleClass(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
    public static void main(String[] args){
        VehicleClass vehicleClass = new OffRoadVehicle();
        vehicleClass.drive();

        VehicleClass vehicleClass1 = new PassengerVehicle();
        vehicleClass1.drive();
    }
}
