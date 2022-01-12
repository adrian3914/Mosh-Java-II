package ca.adrian;

public class TaxCalculator2018 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

   @Override
    public double calculateTax(){
        var minTax = TaxCalculator.minimumTax;
        return taxableIncome * 0.3;
    }
}
