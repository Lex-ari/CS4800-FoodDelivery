package Food;

public class ToppingManager {
    public static Food addAdditionalCostToItem(String type, Food foodItem) {
        switch (type) {
            case "Lettuce":
                return new Lettuce(foodItem, 0.5);
            case "Cheese":
                return new Cheese(foodItem, 1.0);
            case "Ketchup":
                return new Ketchup(foodItem, 0.1);
            case "Mayonnaise":
                return new Mayonnaise(foodItem, 0.1);
            case "Bacon":
                return new Bacon(foodItem, 1.0);
            case "Avocado":
                return new Avocado(foodItem, 1.0);
            default:
                return null;
        }
    }
}
