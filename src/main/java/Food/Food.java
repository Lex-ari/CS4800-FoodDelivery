package Food;

public interface Food {
    String toString();
    double getPrice();
    void addIngredient(FoodOption ingredient);

    Food removeDietaryRestrictions(Diet.DietaryRestriction diet);
}
