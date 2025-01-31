package java8;

interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn(){              // no need to override the default method in implementation class,
                                                        // it is automatically there
        return "turning vehicle alarm on";
    }
    default String turnAlarmOff(){
        return "turning vehicle alarm off";
    }
    static String noOfWheels(){      // we can't override the static method in child class or implementation class
        return "two";
    }
}
class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "Brand name";
    }

    @Override
    public String speedUp() {
        return "Speed is going up";
    }

    @Override
    public String slowDown() {
        return "Speed is going down";
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(Vehicle.noOfWheels());
    }
}
