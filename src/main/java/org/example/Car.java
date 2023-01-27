package org.example;

import java.util.Objects;

public class Car {
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;
    private static final int NUMBER_OF_TIRES = 4;
    private static final int NUMBER_OF_DOORS = 5;
    private static final boolean SEAT_BELT = true;
    private static final boolean AIR_BAG = true;


    public Car(int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }

    public Car() {
        this.numberOfTires = NUMBER_OF_TIRES;
        this.numberOfDoors = NUMBER_OF_DOORS;
        this.seatBelt = SEAT_BELT;
        this.airbag = AIR_BAG;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean getAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getNumberOfTires() == car.getNumberOfTires() && getNumberOfDoors() == car.getNumberOfDoors() && getSeatBelt() == car.getSeatBelt() && getAirbag() == car.getAirbag();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfTires(), getNumberOfDoors(), getSeatBelt(), getAirbag());
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }
}
