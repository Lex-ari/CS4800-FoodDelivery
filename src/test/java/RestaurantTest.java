import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalTime;
import java.util.HashMap;
import Cuisine.CuisineType;
import Food.*;

public class RestaurantTest {
    private Restaurant restaurant;
    private TimeRange timeRange;
    private CPPFoodDelivery cppFoodDelivery;
    private MenuItem menuItem;

    @Before
    public void setUp() {
        FoodOptionManager.getInstance();
        timeRange = new TimeRange(LocalTime.of(9, 0), LocalTime.of(22, 0));
        cppFoodDelivery = new CPPFoodDelivery();
        restaurant = new Restaurant("Test Restaurant", "123 Main St", "Test County", timeRange, CuisineType.Chinese, cppFoodDelivery);

        menuItem = new MenuItem();
        menuItem.addIngredient(FoodOption.Cheese);
        menuItem.addIngredient(FoodOption.Bread);
    }

    @Test
    public void testGetName() {
        assertEquals("Test Restaurant", restaurant.getName());
    }

    @Test
    public void testSetName() {
        restaurant.setName("New Name");
        assertEquals("New Name", restaurant.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", restaurant.getAddress());
    }

    @Test
    public void testSetAddress() {
        restaurant.setAddress("456 Elm St");
        assertEquals("456 Elm St", restaurant.getAddress());
    }

    @Test
    public void testGetCounty() {
        assertEquals("Test County", restaurant.getCounty());
    }

    @Test
    public void testSetCounty() {
        restaurant.setCounty("New County");
        assertEquals("New County", restaurant.getCounty());
    }

    @Test
    public void testGetOperatingHours() {
        assertEquals(timeRange, restaurant.getOperatingHours());
    }

    @Test
    public void testGetOpeningTime() {
        assertEquals(LocalTime.of(9, 0), restaurant.getOpeningTime());
    }

    @Test
    public void testGetClosingTime() {
        assertEquals(LocalTime.of(22, 0), restaurant.getClosingTime());
    }

    @Test
    public void testIsRestaurantOpen() {
        assertTrue(restaurant.isRestaurantOpen(LocalTime.of(10, 0)));
        assertFalse(restaurant.isRestaurantOpen(LocalTime.of(23, 0)));
    }


    @Test
    public void testGetMenu() {
        MenuItem item1 = new MenuItem();
        item1.addIngredient(FoodOption.Cheese);
        item1.addIngredient(FoodOption.Bread);

        MenuItem item2 = new MenuItem();
        item2.addIngredient(FoodOption.Pistachios);
        item2.addIngredient(FoodOption.Avocado);

        restaurant.addFoodToMenu("Cheese Bread", item1);
        restaurant.addFoodToMenu("Pistachio Avocado", item2);

        HashMap<String, MenuItem> menu = restaurant.getMenu();
        assertEquals(2, menu.size());

    }
    }
