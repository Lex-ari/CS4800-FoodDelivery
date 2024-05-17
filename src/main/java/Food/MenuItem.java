package Food;
import Diet.DietaryRestriction;

import java.util.ArrayList;

public class MenuItem implements Food{
    private final ArrayList<FoodOption> ingredients;

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

    public void removeDietaryRestrictions(DietaryRestriction diet){
        for (FoodOption ingredient : ingredients){
            if (DietaryRestriction.isDietaryRestriction(ingredient, diet)){
                ingredients.remove(ingredient);
            }
        }
    }
}
