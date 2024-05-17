import Cuisine.CuisineType;
import Diet.*;
import Food.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args){
        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();
        Restaurant restaurant = new Restaurant("McDonalds", "1234 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), CuisineType.American, cppFoodDelivery);
        Customer customer = new Customer("John Doe", "5678 Elm St", "Los Angeles", cppFoodDelivery, DietaryRestriction.None);
        DeliveryDriver deliveryDriver = new DeliveryDriver("Jane Doe", "91011 Oak St", "Los Angeles", cppFoodDelivery);
        deliveryDriver.addShift(TimeShift.FirstShift);

        ArrayList<Food> foodItems = new ArrayList<>();
        MenuItem baseBigMac = new MenuItem();
        baseBigMac.addIngredient(FoodOption.Beef);
        baseBigMac.addIngredient(FoodOption.Bun);
        //baseBigMac.removeDietaryRestrictions(DietaryRestriction.Vegan);
        Food toppedFood = ToppingManager.addAdditionalCostToItem("Cheese", baseBigMac);
        toppedFood = ToppingManager.addAdditionalCostToItem("Ketchup", toppedFood);
        foodItems.add(toppedFood);
        // System.out.println(baseBigMac.toString());
        customer.placeOrder(restaurant, foodItems, LocalTime.of(12, 0));

        deliveryDriver.finishDelivery();


        System.out.println(restaurant.isRestaurantOpen(LocalTime.now()));
    }
}
