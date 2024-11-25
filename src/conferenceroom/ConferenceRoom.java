package conferenceroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Building{
    private String buildingId;
    Map<String, Floor> floors = new HashMap<>();
}
class Floor{
    private String floorNumber;
    Map<String, Room> rooms = new HashMap<>();
}

class Room{
    private String roomId;
    Set<Booking> bookings = new HashSet<>();
}

class Booking {
    private String bookingId;
    private int startHour;
    private int endHour;
    private String userId;
}

public class ConferenceRoom {
    public static void main(String[] args){
         Map<String, Building> buildings = new HashMap<>();


    }
}
