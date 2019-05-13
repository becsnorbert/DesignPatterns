package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeWithHook extends CaffeineBeverage {

    @Override
    protected void addConiments() {
        System.out.println("Adding Sugar and Milk!");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffe through filter!");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffe (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO is trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
