package ca.adrian;

public class TaxCalculator2018 extends AbstractTaxCalculator{
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

   @Override
    public double calculateTax(){
        getTaxableIncome(230_000, 120_000);
        return taxableIncome * 0.3;
    }
}
