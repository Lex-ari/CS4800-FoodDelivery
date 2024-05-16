package Food;
import java.util.ArrayList;

public class MenuItem implements Food {
    private final ArrayList<FoodOption> ingredients;

    public MenuItem() {
        ingredients = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (FoodOption ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void addIngredient(FoodOption ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (FoodOption ingredient : ingredients) {
            sb.append(ingredient.toString());
            sb.append("(").append(ingredient.getPrice()).append("), ");
        }
        if (!ingredients.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" - $").append(getPrice());
        return sb.toString();
    }
}
