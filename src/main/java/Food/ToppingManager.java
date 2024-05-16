package Food;

public class ToppingManager {

    public static Food addAdditionalCostToItem(String type, Food foodItem) {
        switch (type) {
            case "Lettuce":
                return new Lettuce(foodItem);
            case "Cheese":
                return new Cheese(foodItem);
            case "Ketchup":
                return new Ketchup(foodItem);
            case "Mayonnaise":
                return new Mayonnaise(foodItem);
            case "Bacon":
                return new Bacon(foodItem);
            case "Avocado":
                return new Avocado(foodItem);
            default:
                return null;
        }
    }
}
