package strategy.billing;

public class Main {

    public static void main(String[] args) {
        Customer a = new Customer();
        a.setStrategy(new NormalStrategy());

        // Normál számlázás
        a.add(1.2, 1);

        // Happy hour inditása
        a.setStrategy(new HappyHourStrategy());
        a.add(1.2, 2);


        // Új ügyfél
        Customer b = new Customer();
        b.setStrategy(new HappyHourStrategy());
        b.add(0.8, 1);
        // Az ügyfél fizet
        b.printBill();

        // Happy hour vége
        b.setStrategy(new NormalStrategy());
        b.add(1.3, 2);
        b.add(2.5, 1);
        b.printBill();
    }

}
