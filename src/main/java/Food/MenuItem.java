package Food;
import java.util.ArrayList;


public class MenuItem implements Food {
    private final ArrayList<FoodOption> ingredients;

    public MenuItem(String name) {
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

}
