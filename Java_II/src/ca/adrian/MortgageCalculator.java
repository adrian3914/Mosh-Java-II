package ca.adrian;

public class MortgageCalculator {
    // fields
    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    // constructor
    public MortgageCalculator(int principal, float annualInterest, byte years){
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setYears(years);
    }

    public double[] getRemainingBalances(){
        var balances = new double[getNumberOfPayments()];

        for (short month = 1; month <= balances.length; month++)
            balances[month -1] = calculateBalance(month);

        return balances;
    }

    private boolean isYearsValid(byte years){
        boolean isValid = false;
        if (years > 0)
            isValid = true;
        return isValid;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        double balance = principal
                * (Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()) - Math.pow(1 + getMonthlyInterest(), numberOfPaymentsMade))
                / (Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()) - 1);

        return balance;
    }

    public double calculateMortgage() {
        return principal
                * (getMonthlyInterest() * Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()))
                / (Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()) - 1);
    }

    private float getMonthlyInterest(){
        return annualInterest / PERCENT/ MONTHS_IN_YEAR;
    }


    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private void setYears(byte years) throws IllegalArgumentException {
        if (isYearsValid(years))
            this.years = years;
        else
            throw new IllegalArgumentException("Years cannot be less or equal zero");
    }

    private void setAnnualInterest(float annualInterest) throws IllegalArgumentException {
        if (annualInterest <= 0)
            throw new IllegalArgumentException("Interest cannot be less equal than zero");
        this.annualInterest = annualInterest;
    }

    private void setPrincipal(int principal) throws IllegalArgumentException{
        if (principal <= 0)
            throw new IllegalArgumentException("Principal cannot be less equal than zero");
        this.principal =principal;
    }
}
