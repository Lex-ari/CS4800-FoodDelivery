package Food;

public abstract class Topping implements Food {
    protected Food food;
    protected double price;

    public Topping(Food food, double price) {
        this.food = food;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("+%5.2f", this.price) + ": " + "ADD'" + this.getClass().getSimpleName() + "\n"  + this.food.toString();
    }

    @Override
    public double getPrice() {
        // System.out.println(String.format("%5.2f", this.price) + ": " + "ADD'" + this.getClass().getSimpleName() + "\n"  + this.food.toString());
        return this.price + food.getPrice();
    }

    public void addIngredient(FoodOption ingredient) {
        throw new UnsupportedOperationException("Cannot add ingredients to a topping.");
    }

    public Food removeDietaryRestrictions(Diet.DietaryRestriction diet) {
        this.food = this.food.removeDietaryRestrictions(diet);
        return this;
    }
}

class Lettuce extends Topping {
    public Lettuce(Food item, double price) {
        super(item, price);
    }
}

class Cheese extends Topping {
    public Cheese(Food item, double price) {
        super(item, price);
    }
}

class Ketchup extends Topping {
    public Ketchup(Food item, double price) {
        super(item, price);
    }
}

class Mayonnaise extends Topping {
    public Mayonnaise(Food item, double price) {
        super(item, price);
    }
}

class Bacon extends Topping {
    public Bacon(Food item, double price) {
        super(item, price);
    }
}

class Avocado extends Topping {
    public Avocado(Food item, double price) {
        super(item, price);
    }
}
