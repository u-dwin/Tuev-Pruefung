package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carPark = initialiseCarPark();

        System.out.println("There are following cars in the given car park: ");
        carPark.forEach(car -> System.out.println(car.toString()));
    }

    public static List<Car> initialiseCarPark() {
        Car mercedes = new Car();
        Car volkswagen = new Car(4, 3, true, true);
        Car kamaz = new Car(10, 2, true, true);

       // List<Car> carPark = new ArrayList<>(List.of(mercedes, volkswagen, kamaz)) ;

        return new ArrayList<>(List.of(mercedes, volkswagen, kamaz));
    }

}