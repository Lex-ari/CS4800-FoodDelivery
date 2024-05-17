package Food;
import Diet.*;

public enum FoodOption implements Food {
    Cheese("Cheese", MacronutrientType.Carb, false, true, false, 1.0),
    Bread("Bread", MacronutrientType.Carb, false, false, false, 2.0),
    Lentils("Lentils", MacronutrientType.Carb, false, false, false, 1.0),
    Pistachios("Pistachios", MacronutrientType.Carb, false, false, true, 0.5),
    Fish("Fish", MacronutrientType.Protein, true, false, false, 5),
    Chicken("Chicken", MacronutrientType.Protein, true, false, false, 5),
    Beef("Beef", MacronutrientType.Protein, true, false, false, 6),
    Tofu("Tofu", MacronutrientType.Protein, false, false, false, 4),
    Avocado("Avocado", MacronutrientType.Fat, false, false, false, 2),
    SourCream("SourCream", MacronutrientType.Fat, false, true, false, 1),
    Tuna("Tuna", MacronutrientType.Fat, true, false, false, 5),
    Peanuts("Peanuts", MacronutrientType.Fat, false, false, true, 1),
    Bun("Bun", MacronutrientType.Carb, false, false, false, 1.0);

    private final String name;
    private final boolean isMeat;
    private final boolean isDairy;
    private final boolean isNut;
    private final double price;
    private final MacronutrientType macronutrientType;

    FoodOption(String name, MacronutrientType macronutrientType, boolean isMeat, boolean isDairy, boolean isNut, double price) {
        this.name = name;
        this.isMeat = isMeat;
        this.isDairy = isDairy;
        this.isNut = isNut;
        this.macronutrientType = macronutrientType;
        this.price = price;
        FoodOptionManager.getInstance().addFoodOption(this);
    }

    public static void initalizeFoodOptions() {
        FoodOption[] foodOptions = FoodOption.values();
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public boolean isDairy() {
        return isDairy;
    }

    public boolean isNut() {
        return isNut;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void addIngredient(FoodOption ingredient) {

    }

    public MacronutrientType getMacronutrientType() {
        return macronutrientType;
    }
}
