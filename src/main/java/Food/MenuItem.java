package Food;
import java.util.ArrayList;

public class MenuItem implements Food{
    private final ArrayList<Food> ingredients;

    public MenuItem() {
        ingredients = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Food ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void addIngredient(FoodOption ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        String string = "";
        for (Food ingredient : ingredients) {
            string += String.format(" %5.2f", ingredient.getPrice()) + ": " + ingredient + "\n";
        }
        return string;
    }
}