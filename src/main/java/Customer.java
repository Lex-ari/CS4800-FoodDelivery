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
        System.out.println(getName() + " received order " + order.toString());
        orders.remove(order);
        deliveryHistory.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Order> getDeliveryHistory() {
        return deliveryHistory;
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

    @Override
    public String toString() {
        return "Customer: " + super.toString();
    }
}
