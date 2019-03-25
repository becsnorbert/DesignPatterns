package strategy.billing;

import java.util.List;

public class NormalStrategy implements BillingStrategy {
    @Override
    public double sum(List<Double> drinks) {
        double sum = 0;
        for (Double i : drinks) {
            sum += i;
        }
        return sum;
    }
}
