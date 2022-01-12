package ca.adrian;

public class AbstractTaxCalculator implements TaxCalculator {

    protected double getTaxableIncome(double income, double expenses ){
        return income - expenses;
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
