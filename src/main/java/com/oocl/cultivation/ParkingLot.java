package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private final int capacity;
    private Map<ParkingTicket, Car> cars = new HashMap<>();
    private String packErrorMessage;
    private String fetchErrorMessage;


    public ParkingLot() {
        this(10);
    }

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public  ParkingTicket pack(Car car) {
        ParkingTicket Parkingticket =null;
        if(cars.size() < capacity){
            Parkingticket =new ParkingTicket(car.getId());
            cars.put(Parkingticket,car);
            packErrorMessage=null;
        }else{
            packErrorMessage="The parking lot is full.";
        }
        return Parkingticket;
    }

    public int getAvailableParkingPosition() {
        return cars.size() - capacity;
    }

    public Car fetch(ParkingTicket ticket) {
        Car car = cars.get(ticket);
        if(car != null) {
            cars.remove(ticket);
            fetchErrorMessage=null;
        }else{
            fetchErrorMessage="Unrecognized parking ticket.";
        }
        return  car;
//        List<E> list =new ArrayList<E>();
//        list.
    }

    public String getPackErrorMessage() {
        return packErrorMessage;
    }

    public void setPackErrorMessage(String packErrorMessage) {
        this.packErrorMessage = packErrorMessage;
    }
    public String getFetchErrorMessage() {
        return fetchErrorMessage;
    }

    public void setFetchErrorMessage(String fetchErrorMessage) {
        this.fetchErrorMessage = fetchErrorMessage;
    }
}
