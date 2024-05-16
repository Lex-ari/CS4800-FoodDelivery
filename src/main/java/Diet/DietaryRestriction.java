package Diet;

import Food.FoodOption;
import Food.FoodOptionManager;

import java.sql.Array;
import java.util.*;

public enum DietaryRestriction {
    Paleo,
    Vegan,
    Nut;


    private static Map<FoodOption, ArrayList<DietaryRestriction>> dietaryRestrictionMap= new HashMap<>();
    static {

        List<FoodOption> carbOptions = FoodOptionManager.getInstance().getFoodOptions(MacronutrientType.Carb);
        List<FoodOption> proteinOptions = FoodOptionManager.getInstance().getFoodOptions(MacronutrientType.Protein);
        List<FoodOption> fatOptions = FoodOptionManager.getInstance().getFoodOptions(MacronutrientType.Fat);
        List<FoodOption> allOptions = new ArrayList<>();
        allOptions.addAll(carbOptions);
        allOptions.addAll(proteinOptions);
        allOptions.addAll(fatOptions);

        for (FoodOption option : carbOptions){
            dietaryRestrictionMap.put(option, new ArrayList<>());
        }
        for (FoodOption option : proteinOptions){
            dietaryRestrictionMap.put(option, new ArrayList<>());
        }
        for (FoodOption option : fatOptions){
            dietaryRestrictionMap.put(option, new ArrayList<>());
        }

        // Rule Paleo
        for (FoodOption option : allOptions) {
            if (option.getMacronutrientType().equals(MacronutrientType.Carb) &&
                    !option.equals(FoodOption.Pistachios)){
                addDietaryRestriction(option, DietaryRestriction.Paleo);
            }
            if (option.isDairy()){
                addDietaryRestriction(option, DietaryRestriction.Paleo);
            }
            if (option.isDairy()){
                addDietaryRestriction(option, DietaryRestriction.Paleo);
            }
        }

        // Rule Vegan
        for (FoodOption option : allOptions) {
            if (option.isMeat()){
                addDietaryRestriction(option, DietaryRestriction.Vegan);
            }
            if (option.isDairy()){
                addDietaryRestriction(option, DietaryRestriction.Vegan);
            }
        }

        // Rule Nut
        for (FoodOption option : allOptions) {
            if (option.isNut()){
                addDietaryRestriction(option, DietaryRestriction.Nut);
            }
        }

    }
    private static void addDietaryRestriction(FoodOption foodOption, DietaryRestriction restriction){
        List<DietaryRestriction> restrictionList = dietaryRestrictionMap.get(foodOption);
        if (!restrictionList.contains(restriction)){
            restrictionList.add(restriction);
        }
    }

    public boolean isDietaryRestriction(FoodOption foodOption, DietaryRestriction restriction){
        return dietaryRestrictionMap.get(foodOption).contains(restriction);
    }
}


