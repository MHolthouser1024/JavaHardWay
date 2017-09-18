import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
      Scanner keyboard = new Scanner(System.in);
      double inches, feet, pounds, kg, m, bmi;

      System.out.print( "Your height (feet only): " );
      keyboard.nextDouble();

      System.out.print( "Your height (inches): " );
      inches = keyboard.nextDouble();

      System.out.print( "Your weight in pounds: ");
      pounds = keyboard.nextDouble();


      kg = pounds * (1/2.2046226218);
      m = inches * .0254;

      bmi = kg / (m*m);

      System.out.println( "Your BMI is " + bmi );
  }
}
