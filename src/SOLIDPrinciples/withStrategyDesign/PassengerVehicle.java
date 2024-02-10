package SOLIDPrinciples.withStrategyDesign;

public class PassengerVehicle extends VehicleClass {

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
