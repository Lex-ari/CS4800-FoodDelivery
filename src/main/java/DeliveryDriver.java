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
        this.cppFoodDelivery = cppFoodDelivery;
    }

    public void addShift(TimeShift shift) {
        TimeRange timeShift = TimeShiftFactory.getInstance().getTimeShift(shift);
        shifts.add(timeShift);
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
       if (!isAvailable(order.getOrderPickUpTime())) {
            return false;
        }
        if (!inCounty(order.getCustomer().getCounty())) {
            return false;
        }
        if (currentOrder != null) {
            return false;
        }
        return true;
    }

    public void finishDelivery() {
        LocalTime deliveryStartTime = currentOrder.getOrderPickUpTime();
        int random = (int) (Math.random() * 15) + 15;
        LocalTime deliveryEndTime = deliveryStartTime.plusMinutes(random);
        currentOrder.setOrderDeliveredTime(deliveryEndTime);
        completedOrders.add(currentOrder);
        cppFoodDelivery.completeOrder(currentOrder);
        currentOrder = null;
    }

    public ArrayList<Order> getCompletedOrders() {
        return completedOrders;
    }

    public void assignOrder(Order order) {
        currentOrder = order;
    }

    @Override
    public String toString() {
        return "Delivery Driver: " + super.toString();
    }
    public Order getCurrentOrder(){
        return currentOrder;
    }

}
