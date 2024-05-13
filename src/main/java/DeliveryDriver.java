import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class DeliveryDriver extends User {
    private final ArrayList<TimeRange> shifts = new ArrayList<>();
    private Order currentOrder;
    private final ArrayList<Order> completedOrders = new ArrayList<>();
    private CPPFoodDelivery cppFoodDelivery;

    public DeliveryDriver(String name, String address, String county, CPPFoodDelivery cppFoodDelivery) {
        super(name, address, county);
        cppFoodDelivery.addDeliveryDriver(this);
    }

    public void addShift(TimeRange shift) {
        shifts.add(shift);
    }

    public void removeShift(TimeRange shift) {
        shifts.remove(shift);
    }

    public boolean isAvailable(LocalTime time) {
        for (TimeRange shift : shifts) {
            if (shift.contains(time)) {
                return true;
            }
        }
        return false;
    }

    public boolean inCounty(String county) {
        return this.getCounty().equals(county);
    }

    public boolean canTakeOrder(Order order) {
        return isAvailable(order.getOrderPickUpTime()) && inCounty(order.getRestaurant().getCounty()) && currentOrder == null;
    }

    public void finishDelivery() {
        completedOrders.add(currentOrder);
        cppFoodDelivery.completeOrder(currentOrder);
        currentOrder = null;
    }

    public void assignOrder(Order order) {
        currentOrder = order;
    }




}
