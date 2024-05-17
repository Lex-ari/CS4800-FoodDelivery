import static org.junit.Assert.*;

import Cuisine.CuisineType;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalTime;
import java.util.ArrayList;
import Diet.*;


public class DeliveryDriverTest {
    private DeliveryDriver driver;
    private CPPFoodDelivery cppFoodDelivery;
    private Order order;

    @Before
    public void setUp() {
        cppFoodDelivery = new CPPFoodDelivery();
        driver = new DeliveryDriver("John Doe", "123 Main St", "Test County", cppFoodDelivery);

        // Mock Restaurant
        TimeRange timeRange = new TimeRange(LocalTime.of(9, 0), LocalTime.of(22, 0));
        Restaurant restaurant = new Restaurant("Test Restaurant", "456 Elm St", "Test County", timeRange, CuisineType.Chinese, cppFoodDelivery);

        driver.addShift(TimeShift.FirstShift);
        Customer customer = new Customer("Jane Doe", "789 Oak St", "Test County", cppFoodDelivery, DietaryRestriction.Vegan);
        order = new Order(restaurant, customer, LocalTime.of(12, 0), new ArrayList<>(), DietaryRestriction.Vegan);
    }

    @Test
    public void testConstructor() {
        assertEquals("John Doe", driver.getName());
        assertEquals("123 Main St", driver.getAddress());
        assertEquals("Test County", driver.getCounty());
        assertTrue(cppFoodDelivery.getDeliveryDrivers().contains(driver));
    }

    @Test
    public void testAddShift() {
        driver.addShift(TimeShift.SecondShift);
        assertTrue(driver.isAvailable(LocalTime.of(15, 0)));
        assertFalse(driver.isAvailable(LocalTime.of(23, 0)));
    }

    @Test
    public void testIsAvailable() {
        assertTrue(driver.isAvailable(LocalTime.of(10, 0)));
        assertFalse(driver.isAvailable(LocalTime.of(18, 0)));
    }

    @Test
    public void testInCounty() {
        assertTrue(driver.inCounty("Test County"));
        assertFalse(driver.inCounty("Other County"));
    }

    @Test
    public void testCanTakeOrder() {
        assertTrue(driver.canTakeOrder(order));

        // Assign order and test again
        driver.assignOrder(order);
        assertFalse(driver.canTakeOrder(order));
    }

    @Test
    public void testFinishDelivery() {
        driver.assignOrder(order);
        driver.finishDelivery();
        assertTrue(driver.getCompletedOrders().contains(order));
        assertNull(driver.getCurrentOrder());
    }

    @Test
    public void testAssignOrder() {
        driver.assignOrder(order);
        assertEquals(order, driver.getCurrentOrder());
    }

    @Test
    public void testToString() {
        assertEquals("Delivery Driver: John Doe", driver.toString());
    }
}
