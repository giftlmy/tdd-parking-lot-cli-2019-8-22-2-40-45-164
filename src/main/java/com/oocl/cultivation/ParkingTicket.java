package com.oocl.cultivation;

public class ParkingTicket {
    private String cardid;

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public ParkingTicket(String cardid) {
        this.cardid = cardid;
    }
}
