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
}

class Lettuce extends Topping {
    public Lettuce(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Lettuce" + food.toString();
    }
}

class Cheese extends Topping {
    public Cheese(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Cheese" + food.toString();
    }
}
class Ketchup extends Topping {
    public Ketchup(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Ketchup" + food.toString();
    }
}

class Mayonnaise extends Topping {
    public Mayonnaise(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Mayonnaise" + food.toString();
    }
}

class Bacon extends Topping {
    public Bacon(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Bacon" + food.toString();
    }
}

class Avocado extends Topping {
    public Avocado(Food item) {
        super(item);
    }

    @Override
    public String toString(){
        return "Avocado" + food.toString();
    }
}
