package factory;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Balu ordered a " + pizza.getName() + "\n");
    }

}
