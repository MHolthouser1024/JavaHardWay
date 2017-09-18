import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name, sport;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not very old." );

        System.out.print( "How much do you weigh, " + name + "? " );

        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );

        System.out.println( "I was just joking " + name + "." );
        System.out.print( "What is your favorite activity? " );
        sport = keyboard.next();

        System.out.println( "Nice " + name + ". That's my favorite too!" );


/* The program does not blow up if an integer value is entered when the program
  expects a double.  Due to the fact that a double means that it could
  potentially be a fraction, but doesn't need to be */

/* The program doesn't blow up if a numeric value is entered when a string is
  expected. By definition a string can be a number, symbol, or word. */

/* I cannot get the string to blow up. The 2nd question blows up if you do not
  enter a integer.  Same with question 3, a numeric value must be entered. Same
  with the final question, you must enter a numeric value or else it will blow
  up. */
    }
}
