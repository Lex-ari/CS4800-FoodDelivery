import static org.junit.Assert.*;

import Diet.DietaryRestriction;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalTime;
import java.util.ArrayList;
import Cuisine.CuisineType;
import Food.*;

public class CPPFoodDeliveryTest {
    private CPPFoodDelivery cppFoodDelivery;
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryDriver driver;
    private Order order;

    @Before
    public void setUp() {
        cppFoodDelivery = new CPPFoodDelivery();

        // Initialize necessary objects
        TimeRange timeRange = new TimeRange(LocalTime.of(9, 0), LocalTime.of(22, 0));
        restaurant = new Restaurant("Test Restaurant", "456 Elm St", "Test County", timeRange, CuisineType.Chinese, cppFoodDelivery);
        customer = new Customer("Jane Doe", "789 Oak St", "Test County", cppFoodDelivery, DietaryRestriction.Vegan);
        driver = new DeliveryDriver("John Doe", "123 Main St", "Test County", cppFoodDelivery);
        order = new Order(restaurant, customer, LocalTime.of(12, 0), new ArrayList<>(), DietaryRestriction.Vegan);


        driver.addShift(TimeShift.SecondShift);
        driver.addShift(TimeShift.FirstShift);
    }

    @Test
    public void testAddRestaurant() {
        cppFoodDelivery.addRestaurant(restaurant);
        assertTrue(cppFoodDelivery.getRestaurants().contains(restaurant));
    }

    @Test
    public void testAddCustomer() {
        cppFoodDelivery.addCustomer(customer);
        assertTrue(cppFoodDelivery.getCustomers().contains(customer));
    }

    @Test
    public void testAddDeliveryDriver() {
        cppFoodDelivery.addDeliveryDriver(driver);
        assertTrue(cppFoodDelivery.getDeliveryDrivers().contains(driver));
    }

    @Test
    public void testPlaceOrderSuccess() {
        cppFoodDelivery.addRestaurant(restaurant);
        cppFoodDelivery.addCustomer(customer);
        cppFoodDelivery.addDeliveryDriver(driver);

        assertTrue(cppFoodDelivery.placeOrder(order));
        assertEquals(driver, order.getDeliveryDriver());
        assertTrue(cppFoodDelivery.getWorkingOrders().contains(order));
    }

    @Test
    public void testPlaceOrderNoRestaurant() {
        cppFoodDelivery.removeRestaurant(restaurant);
        cppFoodDelivery.addCustomer(customer);
        cppFoodDelivery.addDeliveryDriver(driver);
        assertFalse(cppFoodDelivery.placeOrder(order));
        cppFoodDelivery.addRestaurant(restaurant);
    }

    @Test
    public void testPlaceOrderRestaurantClosed() {
        cppFoodDelivery.addRestaurant(restaurant);
        cppFoodDelivery.addCustomer(customer);
        cppFoodDelivery.addDeliveryDriver(driver);

        Order lateOrder = new Order(restaurant, customer, LocalTime.of(23, 0), new ArrayList<>(), DietaryRestriction.Vegan);
        assertFalse(cppFoodDelivery.placeOrder(lateOrder));
    }

    @Test
    public void testPlaceOrderNoAvailableDrivers() {
        cppFoodDelivery.addRestaurant(restaurant);
        cppFoodDelivery.addCustomer(customer);


        Order busyOrder = new Order(restaurant, customer, LocalTime.of(2, 0), new ArrayList<>(), DietaryRestriction.Vegan);


        assertFalse(cppFoodDelivery.placeOrder(busyOrder));
    }

    @Test
    public void testCompleteOrder() {
        cppFoodDelivery.addRestaurant(restaurant);
        cppFoodDelivery.addCustomer(customer);
        cppFoodDelivery.addDeliveryDriver(driver);
        cppFoodDelivery.placeOrder(order);

        cppFoodDelivery.completeOrder(order);
        assertTrue(cppFoodDelivery.getCompletedOrders().contains(order));
        assertFalse(cppFoodDelivery.getWorkingOrders().contains(order));
        assertTrue(customer.getDeliveryHistory().contains(order));
    }
}
