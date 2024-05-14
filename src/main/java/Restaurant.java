import java.util.ArrayList;

import Cuisine.CuisineType;
import Food.*;
import java.time.LocalTime;

public class Restaurant {
    private String name;
    private String address;
    private String county;
    private TimeRange operatingHours;
    private CuisineType cuisineStyle;
    private ArrayList<Food> menu = new ArrayList<>();
    private CPPFoodDelivery cppFoodDelivery;


    public Restaurant(String name, String address, String county, TimeRange operatingHours, CuisineType cuisineStyle, CPPFoodDelivery cppFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisineStyle = cuisineStyle;
        cppFoodDelivery.addRestaurant(this);
    }

    public void addItemToMenu(Food food) {
        menu.add(food);
    }

    public void removeItemFromMenu(Food food) {
        menu.remove(food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public TimeRange getOperatingHours() {
        return operatingHours;
    }

    public LocalTime getOpeningTime() {
        return operatingHours.start();
    }

    public LocalTime getClosingTime() {
        return operatingHours.end();
    }

    public boolean isRestaurantOpen(LocalTime time) {
        return operatingHours.contains(time);
    }

}
