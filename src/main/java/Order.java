import Diet.DietaryRestriction;
import Food.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryDriver deliveryDriver;
    private DietaryRestriction dietaryRestriction;
    private List<Food> foodItems = new ArrayList<>();
    private LocalTime orderPickUpTime;
    private LocalTime orderDeliveredTime;

    public Order(Restaurant restaurant, Customer customer, LocalTime orderPickUpTime, List<Food> foodItems, DietaryRestriction dietaryRestriction) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.deliveryDriver = null;
        this.orderPickUpTime = orderPickUpTime;
        this.foodItems = foodItems;
        this.dietaryRestriction = dietaryRestriction;
    }

    public void setDeliveryDriver(DeliveryDriver deliveryDriver) {
        this.deliveryDriver = deliveryDriver;
    }

    public void addFoodItem(Food food) {
        foodItems.add(food);
    }

    public void removeFoodItem(Food food) {
        foodItems.remove(food);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Food> getFoodItems() {
        return foodItems;
    }

    public LocalTime getOrderPickUpTime() {
        return orderPickUpTime;
    }

    public LocalTime getOrderDeliveredTime() {
        return orderDeliveredTime;
    }

    public void setOrderDeliveredTime(LocalTime orderDeliveredTime) {
        this.orderDeliveredTime = orderDeliveredTime;
    }

    public void setDietaryRestriction(DietaryRestriction dietaryRestriction) {
        this.dietaryRestriction = dietaryRestriction;
    }

    @Override
    public String toString() {
        return "Order{" +
                restaurant + " " +
                customer + " " +
                deliveryDriver + " " +
                ", foodItems=" + foodItems +
                ", orderPickUpTime=" + orderPickUpTime +
                ", orderDeliveredTime=" + orderDeliveredTime +
                '}';
    }

}
