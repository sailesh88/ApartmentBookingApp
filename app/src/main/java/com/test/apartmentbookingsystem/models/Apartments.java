package com.test.apartmentbookingsystem.models;

public class Apartments {

    private String Name;
    private String availability;
    private int rooms;
    private boolean booked;
    private String reservedDates;

    public Apartments(String name, String availability, int rooms, boolean booked, String reservedDates) {
        Name = name;
        this.availability = availability;
        this.rooms = rooms;
        this.booked = booked;
        this.reservedDates = reservedDates;
    }

    @Override
    public String toString() {
        return "Apartments{" +
                "Name='" + Name + '\'' +
                ", availability='" + availability + '\'' +
                ", rooms=" + rooms +
                ", booked=" + booked +
                ", reservedDates='" + reservedDates + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getReservedDates() {
        return reservedDates;
    }

    public void setReservedDates(String reservedDates) {
        this.reservedDates = reservedDates;
    }
}
