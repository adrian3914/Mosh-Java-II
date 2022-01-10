package ca.adrian;

public class Employee {
    // fields
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    // constructors
    public Employee(int baseSalary){
        this(baseSalary, 0); // calling the second constructor
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println("Number of Employees: " + numberOfEmployees);
    }

    // methods
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) throws IllegalArgumentException{

        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary must be greater than zero");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) throws IllegalArgumentException{
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate must be greater than zero");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
