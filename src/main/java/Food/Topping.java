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
        return this.getClass().getSimpleName() + " (" + price + ") + " + food.toString();
    }

    @Override
    public double getPrice() {
        System.out.println(this.getClass().getSimpleName() + " (" + price + ") + " + food.getPrice());
        return this.price + food.getPrice();
    }

    public void addIngredient(FoodOption ingredient) {
        throw new UnsupportedOperationException("Cannot add ingredients to a topping.");
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
