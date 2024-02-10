package SOLIDPrinciples.withStrategyDesign;

public class OffRoadVehicle extends VehicleClass {

    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}


