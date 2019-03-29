package decorator2;

public class Main {

    public static void main(String[] args) {

        // create decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarDecorator(new SimpleWindow()));

        // print the new Window's description
        System.out.println(decoratedWindow.getDescription());

    }

}
