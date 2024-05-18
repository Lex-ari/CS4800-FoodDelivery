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
        driverJohn.addShift(TimeShift.SecondShift);
        driverJohn.addShift(TimeShift.SecondShift);
        driverJane.addShift(TimeShift.FirstShift);
        driverJane.addShift(TimeShift.SecondShift);
        driverJane.addShift(TimeShift.SecondShift);
        driverMichael.addShift(TimeShift.ThirdShift);
        driverMichael.addShift(TimeShift.SecondShift);


        driverEmily.addShift(TimeShift.FirstShift);
        driverEmily.addShift(TimeShift.SecondShift);
        driverEmily.addShift(TimeShift.FirstShift);
        driverDavid.addShift(TimeShift.SecondShift);
        driverSarah.addShift(TimeShift.ThirdShift);


        driverRobert.addShift(TimeShift.FirstShift);
        driverRobert.addShift(TimeShift.SecondShift);
        driverRobert.addShift(TimeShift.ThirdShift);
        driverEmma.addShift(TimeShift.FirstShift);
        driverEmma.addShift(TimeShift.SecondShift);
        driverEmma.addShift(TimeShift.ThirdShift);

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

        System.out.println(System.lineSeparator() +"--- Order #1 ----");
        Order order1 = new Order(mcDonalds, customerAlice, LocalTime.of(3, 0));
        Food specialBigMac = mcDonalds.getFoodFromMenu("Big Mac");
        specialBigMac = specialBigMac.removeDietaryRestrictions(DietaryRestriction.Vegan);
        specialBigMac = ToppingManager.addAdditionalCostToItem("Ketchup", specialBigMac);
        order1.addFoodItem(specialBigMac);
        customerAlice.placeOrder(order1);


        System.out.println(System.lineSeparator() +"--- Order #2 ----");
        Order order2 = new Order(mcDonalds, customerBob, LocalTime.of(13, 0));
        Food specialQPounder = mcDonalds.getFoodFromMenu("Quarter Pounder");
        specialQPounder = ToppingManager.addAdditionalCostToItem("Bacon", specialQPounder);
        order2.addFoodItem(specialQPounder);
        customerBob.placeOrder(order2);


        System.out.println(System.lineSeparator() +"--- Order #3 ----");
        Order order3 = new Order(mcDonalds, customerCatherine, LocalTime.of(22, 0));
        Food specialMcCrispy = mcDonalds.getFoodFromMenu("McCrispy");
        specialMcCrispy = ToppingManager.addAdditionalCostToItem("Cheese", specialMcCrispy);
        specialMcCrispy = ToppingManager.addAdditionalCostToItem("Mayonnaise", specialMcCrispy);
        order3.addFoodItem(specialMcCrispy);
        customerCatherine.placeOrder(order3);


        System.out.println(System.lineSeparator() +"--- Order #4 ----");
        Order order4 = new Order(pandaExpress, customerDaniel, LocalTime.of(15, 0));
        Food specialOrangeChicken = pandaExpress.getFoodFromMenu("Orange Chicken");
        specialOrangeChicken = ToppingManager.addAdditionalCostToItem("Ketchup", specialOrangeChicken);
        order4.addFoodItem(specialOrangeChicken);
        customerDaniel.placeOrder(order4);


        System.out.println(System.lineSeparator() +"--- Order #5 ----");
        Order order5 = new Order(pandaExpress, customerElizabeth, LocalTime.of(16, 0));
        Food specialMapoTofu = pandaExpress.getFoodFromMenu("Mapo Tofu");
        specialMapoTofu = specialMapoTofu.removeDietaryRestrictions(DietaryRestriction.Vegan);
        order5.addFoodItem(specialMapoTofu);
        customerElizabeth.placeOrder(order5);


        System.out.println(System.lineSeparator() +"--- Order #6 ----");
        Order order6 = new Order(fancySpaghet, customerFrank, LocalTime.of(15, 0));
        Food specialSpaghet = fancySpaghet.getFoodFromMenu("Spaghet");
        specialSpaghet = ToppingManager.addAdditionalCostToItem("Cheese", specialSpaghet);
        order6.addFoodItem(specialSpaghet);
        customerFrank.placeOrder(order6);


        System.out.println(System.lineSeparator() +"--- Order #7 ----");
        Order order7 = new Order(makomae, customerGrace, LocalTime.of(15, 0));
        Food specialSalmon = makomae.getFoodFromMenu("Salmon");
        specialSalmon = ToppingManager.addAdditionalCostToItem("Lettuce", specialSalmon);
        order7.addFoodItem(specialSalmon);
        customerGrace.placeOrder(order7);


        System.out.println(System.lineSeparator() +"--- Order #8 ----");
        Order order8 = new Order(mcDonalds, customerHenry, LocalTime.of(14, 0));
        Food specialBigMac2 = mcDonalds.getFoodFromMenu("Big Mac");
        specialBigMac2 = ToppingManager.addAdditionalCostToItem("Bacon", specialBigMac2);
        specialBigMac2 = ToppingManager.addAdditionalCostToItem("Avocado", specialBigMac2);
        order8.addFoodItem(specialBigMac2);
        customerHenry.placeOrder(order8);


        System.out.println(System.lineSeparator() +"--- Order #9 ----");
        Order order9 = new Order(mcDonalds, customerIsabella, LocalTime.of(11, 0));
        Food specialQPounder2 = mcDonalds.getFoodFromMenu("Quarter Pounder");
        specialQPounder2 = ToppingManager.addAdditionalCostToItem("Cheese", specialQPounder2);
        order9.addFoodItem(specialQPounder2);
        customerIsabella.placeOrder(order9);


        System.out.println(System.lineSeparator() + "--- Order #10 ----");
        Order order10 = new Order(pandaExpress, customerJack, LocalTime.of(12, 0));
        Food specialOrangeChicken2 = pandaExpress.getFoodFromMenu("Orange Chicken");
        specialOrangeChicken2 = specialOrangeChicken2.removeDietaryRestrictions(DietaryRestriction.Paleo);
        order10.addFoodItem(specialOrangeChicken2);
        customerJack.placeOrder(order10);

        System.out.println(System.lineSeparator() + "Completing Deliveries");
        cppFoodDelivery.compelteDeliveries();

    }
}
