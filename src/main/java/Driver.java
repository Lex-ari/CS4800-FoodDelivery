import java.time.LocalTime;

public class Driver {

    public static void main(String[] args){
        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();
        Restaurant restaurant = new Restaurant("McDonalds", "1234 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), "Fast Food", cppFoodDelivery);
        Customer customer = new Customer("John Doe", "5678 Elm St", "Los Angeles", cppFoodDelivery);
        DeliveryDriver deliveryDriver = new DeliveryDriver("Jane Doe", "91011 Oak St", "Los Angeles", cppFoodDelivery);



    }
}
