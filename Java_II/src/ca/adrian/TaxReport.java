package ca.adrian;

public class TaxReport {

    public void show(TaxCalculator taxCalculator){
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }

}
