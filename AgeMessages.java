import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook Account" );
    }
    if ( age >= 13 ) {
      System.out.println( "\tYou are old enough to create a Facebook Account" );
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age >= 16 ) {
      System.out.println( "\tYou are old enough to get a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get tattoo" );
    }
    if (age >= 18 ) {
      System.out.println( "\tYou are old enough to get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\tYou are old enought to drink alcohol" );
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
    }
    if ( age >= 35 ) {
      System.out.println( "\tYou are old enough to run for President of the " +
       "U.S.");
    }
    if ( age >= 65 ) {
      System.out.println( "\tYou are old enough to retire!" );
    }
    if ( age < 65 ) {
      System.out.println( "\tYou are too young to retire!" );
    }
    System.out.println( "\t\t(How Sad!)" );
    }
    }
/* 1.) (How Sad!) Because 35 failed to meet the criteria of any of the if
    statements, so it skipped to the final line of code after the if
    statements*/
