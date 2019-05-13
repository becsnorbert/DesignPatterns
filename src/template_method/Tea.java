package template_method;

public class Tea extends CaffeineBeverage {

    @Override
    protected void addConiments() {
        System.out.println("Adding Lemon!");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea!");
    }
}
