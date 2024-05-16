import java.time.LocalTime;
import java.util.ArrayList;

import Diet.DietaryRestriction;
import Food.*;

public class Customer extends User {
    private final ArrayList<Order> orders = new ArrayList<>();
    private final ArrayList<Order> deliveryHistory = new ArrayList<>();
    private final DietaryRestriction dietaryRestriction;
    private final CPPFoodDelivery cppFoodDelivery;

    public Customer(String name, String address, String county, CPPFoodDelivery cppFoodDelivery, DietaryRestriction dietaryRestriction) {
        super(name, address, county);
        this.cppFoodDelivery = cppFoodDelivery;
        this.dietaryRestriction = dietaryRestriction;
        cppFoodDelivery.addCustomer(this);
    }

    public DietaryRestriction getDietaryRestriction() {
        return dietaryRestriction;
    }

    public void setOrderDelivered(Order order) {
        System.out.println(getName() + " received order from " + order.getRestaurant().getName() + " at " + order.getOrderPickUpTime() + " with food items " + ord);
        orders.remove(order);
        deliveryHistory.add(order);
    }

    public void placeOrder(Restaurant restaurant, ArrayList<Food> foodItems, LocalTime orderPickUpTime) {
        Order order = new Order(restaurant, this, orderPickUpTime, foodItems, getDietaryRestriction());
        placeOrder(order);
    }

    public void placeOrder(Order order) {
        if (cppFoodDelivery.placeOrder(order))
        {
            orders.add(order);
            System.out.println("Order placed");
        }
        else
        {
            System.out.println("Order not placed");
        }
    }
}
