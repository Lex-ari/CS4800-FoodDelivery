import Food.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryDriver deliveryDriver;
    // Dietary Restrictions
    private List<Food> foodItems = new ArrayList<>();
    private LocalTime orderPickUpTime;
    private LocalTime orderDeliveredTime;

    public Order(Restaurant restaurant, Customer customer) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.deliveryDriver = null;
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




}
