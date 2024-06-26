import java.util.ArrayList;

import Cuisine.CuisineType;
import Food.*;
import java.time.LocalTime;
import java.util.HashMap;

public class Restaurant {
    private String name;
    private String address;
    private String county;
    private TimeRange operatingHours;
    private CuisineType cuisineStyle;
    private CPPFoodDelivery cppFoodDelivery;
    private final HashMap<String, MenuItem> menu = new HashMap<String, MenuItem>();


    public Restaurant(String name, String address, String county, TimeRange operatingHours, CuisineType cuisineStyle, CPPFoodDelivery cppFoodDelivery) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisineStyle = cuisineStyle;
        cppFoodDelivery.addRestaurant(this);
    }

    public MenuItem getFoodFromMenu(String name){
        return menu.get(name);
    }

    public void addFoodToMenu(String name, MenuItem food){
        menu.put(name, food);
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

    public HashMap<String, MenuItem> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return getName();
    }

}
