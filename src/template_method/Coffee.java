package template_method;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addConiments() {
        System.out.println("Adding Sugar and Milk!");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffe through filter!");
    }
}
