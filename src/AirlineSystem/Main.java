package AirlineSystem;

import java.math.BigDecimal;
import java.util.*;

class User {
    String userId;
    String name;
    BigDecimal funds;

    public User(String userId, String name, BigDecimal funds){
        this.userId = userId;
        this.name = name;
        this.funds = funds;
    }
}

class Flight {
    String flightNumber;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    String airline;
    String from;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDepartDate() {
        return departDate;
    }

    public void setDepartDate(int departDate) {
        this.departDate = departDate;
    }

    public int getDepartTime() {
        return departTime;
    }

    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }

    public List<FareType> getFareTypes() {
        return fareTypes;
    }

    public void setFareTypes(List<FareType> fareTypes) {
        this.fareTypes = fareTypes;
    }

    int departDate;
    int departTime;
    List<FareType> fareTypes;
}

class FareType {
    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Seat> getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(List<Seat> availableSeat) {
        this.availableSeat = availableSeat;
    }

    String fareType;
    BigDecimal price;
    List<Seat> availableSeat;
}

class Seat {
    String seatNumber;
    boolean isBooked;

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}

class Booking {
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public FareType getFareType() {
        return fareType;
    }

    public void setFareType(FareType fareType) {
        this.fareType = fareType;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    String bookingId;
    User user;
    Flight flight;
    FareType fareType;
    List<Seat> bookedSeats;
    BigDecimal totalAmount;
}
class UserService {
    Map<String, User> users = new HashMap<>();

    public String addUser(String userId, String name, BigDecimal funds){
        User user = new User(userId, name, funds);
        users.put(userId, user);
        return "added user";
    }
    public User getUser(String userId){
        return users.get(userId);
    }
}
class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public List<Flight> searchFlightByPreferredAirline(String from, String to, int departDate, int paxCount, String preferredAirline, String sortBy, String sortType){
        List<Flight> result = new ArrayList<Flight>();
        for(Flight flight : flights){
              if(flight.getFrom().equals(from) && flight.getTo().equals(to) && flight.getDepartDate() == departDate && flight.getAirline() == preferredAirline){
                  for(FareType fareType : flight.getFareTypes()){
                      if(fareType.getAvailableSeat().size() >= paxCount){
                          result.add(flight);
                          break;
                      }
                  }
              }
        }

        if("PRICE".equalsIgnoreCase(sortBy)){
            Collections.sort(result, new Comparator<Flight>() {
                @Override
                public int compare(Flight f1, Flight f2) {
                    BigDecimal price1 = f1.getFareTypes().get(0).getPrice();
                    BigDecimal price2 = f2.getFareTypes().get(0).getPrice();

                    return "DESC".equalsIgnoreCase(sortType) ? price2.compareTo(price1) : price1.compareTo(price2);
                }
            });
//        } else if("DEPARTTIME".equalsIgnoreCase(sortBy)){
//            Collections.sort(result, new Comparator<Flight>() {
//                @Override
//                public int compare(Flight f1, Flight f2) {
//                    int time1 = f1.getDepartTime();
//                    int time2 = f2.getDepartTime();
//                   // return "DESC".equalsIgnoreCase(sortType) ? time2.compareTo(time1) : time1.compareTo(time2);
//                }
//            });
        }

        return result;
    }
}
public class Main {
    public static void main(String[] args){

    }
}
