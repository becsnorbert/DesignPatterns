package strategy.billing;

import java.util.List;

public interface BillingStrategy {
    // A fogyasztott italok összegzett ára
    public double sum(List<Double> drinks);
}
