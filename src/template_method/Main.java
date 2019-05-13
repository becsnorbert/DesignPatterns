package template_method;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        CoffeWithHook coffeWithHook = new CoffeWithHook();


        coffee.prepareRecipe();
        tea.prepareRecipe();
        coffeWithHook.prepareRecipe();


    }


}
