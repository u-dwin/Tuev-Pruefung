package org.example;

public class CarInspectionService {

    public boolean hasFourTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean hasSeatBelt(Car car) {
        return car.getSeatBelt();
    }

    public boolean hasAirbag(Car car) {
        return car.getAirbag();
    }

    public boolean hasThreeOrFiveDoors(Car car) {
        return car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5;
    }


    public boolean checkCar(Car car) {
        return hasFourTires(car) && hasSeatBelt(car) && hasAirbag(car) && hasThreeOrFiveDoors(car);
    }
}
