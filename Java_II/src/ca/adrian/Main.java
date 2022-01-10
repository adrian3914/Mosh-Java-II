package ca.adrian;

public class Main {

    public static void main(String[] args) {
     var control = new TextBox();
     control.disable();
     System.out.println(control.isEnabled());
    }


    /*
       var textBox1 = new TextBox();
       textBox1.setText("Box 1");
       var textBox2 = textBox1;
       textBox2.setText("Hello World");

       System.out.println(textBox1.text);

        var browser = new Browser();
        browser.navigate("http://www.adrian.com");
     */

    /*
         int principal = (int) Console.readNumber("Principal (1K - 1M): ", 1000, 1_000_000);
      float annualInterest =  (float) Console.readNumber("Annual Interest: ", 1, 30);
      byte years = (byte) Console.readNumber("Period (YEARS): ", 1, 30);
      var mortgageCalculator = new MortgageCalculator(principal, annualInterest, years);

      MortgageReport report = new MortgageReport(mortgageCalculator);
      report.printMortgage();
      report.printPaymentSchedule();
     */

}


