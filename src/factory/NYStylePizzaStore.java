package factory;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
