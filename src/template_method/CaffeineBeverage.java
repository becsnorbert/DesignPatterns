package template_method;

public abstract class CaffeineBeverage {

    // This is the Template Methode
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addConiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addConiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water!");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup!");
    }
}
