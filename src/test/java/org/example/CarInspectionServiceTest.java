package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;


class CarInspectionServiceTest {
    @Test
    @Order(1)
    void hasFourTires() {
        Car myCar = new Car();
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasFourTires(myCar);

        Assertions.assertTrue(result);
    }

    @Test
    @Order(2)
    void doesNotHaveFourTires() {
        Car myCar = new Car();
        myCar.setNumberOfTires(3);
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasFourTires(myCar);

        Assertions.assertFalse(result);
    }

    @Test
    @Order(3)
    void hasSeatBelt() {
        Car myCar = new Car();
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasSeatBelt(myCar);

        Assertions.assertTrue(result);
    }

    @Test
    @Order(4)
    void doesNotHaveSeatBelt() {
        Car myCar = new Car();
        myCar.setSeatBelt(false);
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasSeatBelt(myCar);

        Assertions.assertFalse(result);
    }

    @Test
    @Order(5)
    void hasAirbag() {
        Car myCar = new Car();
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasAirbag(myCar);

        Assertions.assertTrue(result);
    }


    @Test
    @Order(6)
    void hasNoAirbag() {
        Car myCar = new Car();
        myCar.setAirbag(false);
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasAirbag(myCar);

        Assertions.assertFalse(result);
    }

    @Test
    @Order(7)
    void hasThreeOrFiveDoors() {
        Car myCar = new Car();
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasThreeOrFiveDoors(myCar);

        Assertions.assertTrue(result);
    }

    @Test
    @Order(8)
    void doesNotHaveThreeOrFiveDoors() {
        Car myCar = new Car();
        myCar.setNumberOfDoors(4);
        CarInspectionService service = new CarInspectionService();
        boolean result = service.hasThreeOrFiveDoors(myCar);

        Assertions.assertFalse(result);
    }

    @Test
    @Order(9)
    void checkCar() {
        Car myCar = new Car();
        CarInspectionService service = new CarInspectionService();
        boolean result = service.checkCar(myCar);

        Assertions.assertTrue(result);
    }

    @Test
    @Order(10)
    void checkBadCar() {
        Car myCar = new Car();
        myCar.setNumberOfDoors(2);
        CarInspectionService service = new CarInspectionService();
        boolean result = service.checkCar(myCar);

        Assertions.assertFalse(result);
    }

}