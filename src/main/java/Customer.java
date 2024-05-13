import java.util.ArrayList;
import Food.*;

public class Customer extends User {
    private final ArrayList<Order> orders = new ArrayList<>();
    private final ArrayList<Order> deliveryHistory = new ArrayList<>();
    private ArrayList<Food> dietaryRestrictions = new ArrayList<>();
    private CPPFoodDelivery cppFoodDelivery;

    public Customer(String name, String address, String county, CPPFoodDelivery cppFoodDelivery) {
        super(name, address, county);
        cppFoodDelivery.addCustomer(this);
    }

    public void requestOrder(Order order) {
        if (cppFoodDelivery.placeOrder(order)) {
            orders.add(order);
        }
        System.out.println("Order failed");
    }

    public void setOrderDelivered(Order order) {
        orders.remove(order);
        deliveryHistory.add(order);
    }
}
