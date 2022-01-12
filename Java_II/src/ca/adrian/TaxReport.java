package ca.adrian;

public class TaxReport {
    private TaxCalculator calculator; // interface

    // constructor, dependency injection by the constructor
    public TaxReport(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
