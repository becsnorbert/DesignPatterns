package factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // A factory objektumunkat ide mozgattuk ebbe az
    // abstract factory metódusba.
    protected abstract Pizza createPizza(String type);

    // other methods here.
}
