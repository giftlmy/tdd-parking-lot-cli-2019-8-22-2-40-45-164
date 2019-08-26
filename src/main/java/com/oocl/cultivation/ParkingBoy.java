package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        ParkingTicket  Parkingticket=null;
        if(car == null) {
            return null;
        }else{
            lastErrorMessage=parkingLot.getPackErrorMessage();
            Parkingticket= parkingLot.pack(car);
        }
        return Parkingticket;
    }

    public Car fetch(ParkingTicket ticket) {
        Car car =null;
        if(ticket == null){
            lastErrorMessage="Please provide your parking ticket.";
            return null;
        }else{
            car = parkingLot.fetch(ticket);
            lastErrorMessage=parkingLot.getFetchErrorMessage();
        }
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
