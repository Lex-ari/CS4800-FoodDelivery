import Food.*;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private CustomerInfo customer;
    // Dietary Restrictions
    private List<Food> foodItems = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
    private float orderPickUpTime;
    private float orderDeliveredTime;
}
