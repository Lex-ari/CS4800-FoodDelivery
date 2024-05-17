import java.util.ArrayList;

public class CPPFoodDelivery {
    private final ArrayList<Restaurant> restaurants = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<DeliveryDriver> deliveryDrivers = new ArrayList<>();
    private final ArrayList<Order> workingOrders = new ArrayList<>();
    private final ArrayList<Order> completedOrders = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        System.out.println("Restaurant " + restaurant.getName() + " added");
        restaurants.add(restaurant);
    }

    public void addCustomer(Customer customer) {
        System.out.println("Customer " + customer.getName() + " added");
        customers.add(customer);
    }

    public void addDeliveryDriver(DeliveryDriver deliveryDriver) {
        System.out.println("Delivery Driver " + deliveryDriver.getName() + " added");
        deliveryDrivers.add(deliveryDriver);
    }

    public boolean placeOrder(Order order) {
        if (order.getCustomer() == null || order.getRestaurant() == null) {
            return false;
        }

        Restaurant restaurant = order.getRestaurant();
        if (!restaurants.contains(restaurant)) {
            System.out.println("Restaurant not found");
            return false;
        }

        if (!restaurant.isRestaurantOpen(order.getOrderPickUpTime())) {
            System.out.println("Restaurant is closed");
            return false;
        }

        for (DeliveryDriver driver : deliveryDrivers) {
            if (driver.canTakeOrder(order)) {
                driver.assignOrder(order);
                order.setDeliveryDriver(driver);
                workingOrders.add(order);
                return true;
            }
        }
        System.out.println("No available drivers");

        return false;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<DeliveryDriver> getDeliveryDrivers() {
        return deliveryDrivers;
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }

    public void addWorkingOrder(Order order) {
        workingOrders.add(order);
    }

    public void completeOrder(Order order) {
        Customer customer = order.getCustomer();
        customer.setOrderDelivered(order);
        workingOrders.remove(order);
        completedOrders.add(order);
        System.out.println("Order completed");
    }

    public ArrayList<Order> getWorkingOrders() {
        return workingOrders;
    }

    public ArrayList<Order> getCompletedOrders() {
        return completedOrders;
    }


    public void completeDeliveries() {
        for (DeliveryDriver driver : deliveryDrivers) {
            if (driver.getCurrentOrder() != null) {
                driver.finishDelivery();
            }
        }
    }

}
