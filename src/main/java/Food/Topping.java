package Food;

public abstract class Topping implements Food{
    protected Food food;
    public Topping(Food food) {
        this.food = food;
    }

    @Override
    public String toString(){
        return this.food.toString();
    }

    @Override
    public double getPrice(){
        return food.getPrice();
    }
}

class Lettuce extends Topping {
    private final double price;
    public Lettuce(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Lettuce" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}

class Cheese extends Topping {
    private final double price;
    public Cheese(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Cheese" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}

class Ketchup extends Topping {
    private final double price;
    public Ketchup(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Ketchup" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}

class Mayonnaise extends Topping {
    private final double price;
    public Mayonnaise(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Mayonnaise" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}

class Bacon extends Topping {
    private final double price;
    public Bacon(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Bacon" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}

class Avocado extends Topping {
    private final double price;
    public Avocado(Food item, double price) {
        super(item);
        this.price = price;
    }

    @Override
    public String toString(){
        return "Avocado" + food.toString();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
