import Cuisine.CuisineType;
import Diet.*;
import Food.*;
import Food.MenuItem;

import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args){
        CPPFoodDelivery cppFoodDelivery = new CPPFoodDelivery();

        Restaurant mcDonalds = new Restaurant("McDonalds", "1234 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), CuisineType.American, cppFoodDelivery);
        MenuItem basicBigMac = new MenuItem();
        basicBigMac.addIngredient(FoodOption.Beef);
        basicBigMac.addIngredient(FoodOption.Bun);
        basicBigMac.addIngredient(FoodOption.Bun);
        basicBigMac.addIngredient(FoodOption.Cheese);
        mcDonalds.addFoodToMenu("Big Mac", basicBigMac);
        MenuItem basicQPounder = new MenuItem();
        basicQPounder.addIngredient(FoodOption.Beef);
        basicQPounder.addIngredient(FoodOption.Bun);
        basicQPounder.addIngredient(FoodOption.Cheese);
        mcDonalds.addFoodToMenu("Quarter Pounder", basicQPounder);
        MenuItem chickenSandwich = new MenuItem();
        chickenSandwich.addIngredient(FoodOption.Chicken);
        chickenSandwich.addIngredient(FoodOption.Bun);
        mcDonalds.addFoodToMenu("McCrispy", chickenSandwich);

        Restaurant pandaExpress = new Restaurant("PandaExpress", "2312 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), CuisineType.Chinese, cppFoodDelivery);
        MenuItem orangeChicken = new MenuItem();
        orangeChicken.addIngredient(FoodOption.Chicken);
        orangeChicken.addIngredient(FoodOption.Pistachios);
        pandaExpress.addFoodToMenu("Orange Chicken", chickenSandwich);

        MenuItem mapoTofu = new MenuItem();
        mapoTofu.addIngredient(FoodOption.Tofu);
        mapoTofu.addIngredient(FoodOption.GroundPork);
        mapoTofu.addIngredient(FoodOption.SichuanPepper);
        mapoTofu.addIngredient(FoodOption.Garlic);
        mapoTofu.addIngredient(FoodOption.Ginger);
        mapoTofu.addIngredient(FoodOption.SoySauce);
        mapoTofu.addIngredient(FoodOption.ChiliBeanPaste);
        pandaExpress.addFoodToMenu("Mapo Tofu", mapoTofu);

        Restaurant makomae = new Restaurant("Makomae", "3222 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), CuisineType.Japanese, cppFoodDelivery);
        MenuItem salmon = new MenuItem();
        salmon.addIngredient(FoodOption.Fish);
        makomae.addFoodToMenu("Salmon", salmon);

        Restaurant fancySpaghet = new Restaurant("FancySpaghet", "2222 Main St", "Los Angeles", new TimeRange(LocalTime.of(8, 0), LocalTime.of(22, 0)), CuisineType.Italian, cppFoodDelivery);
        MenuItem spaghetti = new MenuItem();
        spaghetti.addIngredient(FoodOption.Pasta);
        spaghetti.addIngredient(FoodOption.TomatoSauce);
        spaghetti.addIngredient(FoodOption.GroundBeef);
        spaghetti.addIngredient(FoodOption.Onion);
        spaghetti.addIngredient(FoodOption.Garlic);
        spaghetti.addIngredient(FoodOption.OliveOil);
        spaghetti.addIngredient(FoodOption.Basil);
        spaghetti.addIngredient(FoodOption.Oregano);
        spaghetti.addIngredient(FoodOption.ParmesanCheese);
        fancySpaghet.addFoodToMenu("Spaghet", spaghetti);
        fancySpaghet.addFoodToMenu("Salmon", salmon);

        DeliveryDriver driverJohn = new DeliveryDriver("John Smith", "1234 Pine St", "Los Angeles", cppFoodDelivery);
        DeliveryDriver driverJane = new DeliveryDriver("Jane Johnson", "5678 Maple St", "Los Angeles", cppFoodDelivery);
        DeliveryDriver driverMichael = new DeliveryDriver("Michael Williams", "91011 Oak St", "Los Angeles", cppFoodDelivery);
        DeliveryDriver driverEmily = new DeliveryDriver("Emily Jones", "1213 Walnut St", "Orange County", cppFoodDelivery);
        DeliveryDriver driverDavid = new DeliveryDriver("David Brown", "1415 Cedar St", "Orange County", cppFoodDelivery);
        DeliveryDriver driverSarah = new DeliveryDriver("Sarah Davis", "1617 Birch St", "Orange County", cppFoodDelivery);
        DeliveryDriver driverRobert = new DeliveryDriver("Robert Miller", "1819 Spruce St", "San Bernardino", cppFoodDelivery);
        DeliveryDriver driverEmma = new DeliveryDriver("Emma Wilson", "2021 Elm St", "San Bernardino", cppFoodDelivery);
        driverJohn.addShift(TimeShift.FirstShift);
        driverJane.addShift(TimeShift.SecondShift);
        driverMichael.addShift(TimeShift.ThirdShift);
        driverEmily.addShift(TimeShift.FirstShift);
        driverDavid.addShift(TimeShift.SecondShift);
        driverSarah.addShift(TimeShift.ThirdShift);
        driverRobert.addShift(TimeShift.FirstShift);
        driverEmma.addShift(TimeShift.SecondShift);

        Customer customerAlice = new Customer("Alice Thompson", "1234 Apple St", "Los Angeles", cppFoodDelivery, DietaryRestriction.None);
        Customer customerBob = new Customer("Bob Martinez", "5678 Banana St", "Los Angeles", cppFoodDelivery, DietaryRestriction.None);
        Customer customerCatherine = new Customer("Catherine Clark", "91011 Cherry St", "Los Angeles", cppFoodDelivery, DietaryRestriction.None);
        Customer customerDaniel = new Customer("Daniel Lee", "1213 Grape St", "Los Angeles", cppFoodDelivery, DietaryRestriction.None);
        Customer customerElizabeth = new Customer("Elizabeth Rodriguez", "1415 Lemon St", "Orange County", cppFoodDelivery, DietaryRestriction.None);
        Customer customerFrank = new Customer("Frank Hernandez", "1617 Orange St", "Orange County", cppFoodDelivery, DietaryRestriction.None);
        Customer customerGrace = new Customer("Grace Nguyen", "1819 Peach St", "Orange County", cppFoodDelivery, DietaryRestriction.None);
        Customer customerHenry = new Customer("Henry Kim", "2021 Pear St", "Orange County", cppFoodDelivery, DietaryRestriction.None);
        Customer customerIsabella = new Customer("Isabella Wong", "2223 Plum St", "San Bernardino", cppFoodDelivery, DietaryRestriction.None);
        Customer customerJack = new Customer("Jack Garcia", "2425 Raspberry St", "San Bernardino", cppFoodDelivery, DietaryRestriction.None);

        //baseBigMac.removeDietaryRestrictions(DietaryRestriction.Vegan);


        ArrayList<Food> foodItems = new ArrayList<>();

        //Making an order
        Order order = new Order(mcDonalds, customerAlice, LocalTime.of(12, 0));
        Food specialBigMac = mcDonalds.getFoodFromMenu("Big Mac");
        specialBigMac = specialBigMac.removeDietaryRestrictions(DietaryRestriction.Vegan);
        specialBigMac = ToppingManager.addAdditionalCostToItem("Ketchup", specialBigMac);
        order.addFoodItem(specialBigMac);

        // System.out.println(baseBigMac.toString());
        customerAlice.placeOrder(order);

        cppFoodDelivery.compelteDeliveries();

        System.out.println(mcDonalds.isRestaurantOpen(LocalTime.now()));
    }
}
