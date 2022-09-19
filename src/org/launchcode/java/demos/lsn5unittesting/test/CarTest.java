package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {
    Car test_Car = new Car("Toyota", "Prius", 10, 50);

//    @Before
//    public void createCarObject() {
//        test_Car = new Car("Toyota", "Prius", 10, 50);
//    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_Car.getGasTankLevel(), .001);       // Equals version
    }

//    @Test
//    public void testInitialGasTank() {
//        assertFalse(test_Car.getGasTankLevel() == 0);           // False version
//    }

    //    @Test
//    public void testInitialGasTank() {
//        assertTrue(test_Car.getGasTankLevel() == 10);            // True version
//    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_Car.drive(50);
        assertEquals(9, test_Car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_Car.drive(550);
        assertEquals(0, test_Car.getGasTankLevel(), .001); // (Expected, Actual, Allowed difference)
//        assertEquals(500, test_Car.getOdometer(), .001); returns true
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_Car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than size of the tank");
    }
}
