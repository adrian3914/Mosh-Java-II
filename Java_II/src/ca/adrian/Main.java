package ca.adrian;

public class Main {

    public static void main(String[] args) {

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

    /* Inheritance
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
     */

    /*  The Object Class
        var box1 = new TextBox();
        System.out.println("box1 hashCode: " + box1.hashCode());
        var box2 = box1;
        System.out.println("box2 hashCode: " + box2.hashCode());
        System.out.println(box1.equals(box2));
        System.out.println(box1.toString());
     */

    /*
        Override Methods
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox);
     */

    /*
        // Upcasting and Downcasting
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);

        public static void show(UIControl control){
        if (control instanceof TextBox){
            // cast in order to have access to textBox members
            var textBox = (TextBox) control;
            textBox.setText("Hello from TextBox");
            System.out.println(textBox);
        }
        else
        System.out.println(control);
    }
     */

    /*
        // Comparing Objects
         var point1 = new Point(1,2);
        var point2 = new Point(1,2);

        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
     */

    /*
       // Polymorphism
       UIControl[] controls = { new TextBox(), new CheckBox()};
       for(UIControl control: controls)
           control.render();
     */

}


