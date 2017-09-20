import java.util.Scanner;
// THIS PROGRAM NOW COMPILES AND WORKS CORRECTLY
public class DictionaryOrder {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print( "Make up the name of a programming language! " );
    name = keyboard.nextLine();

    if ( name.compareToIgnoreCase("c++") < 0 )
      System.out.println( name + " comes BEFORE c++" );

    if ( name.compareToIgnoreCase("c++") == 0 )
      System.out.println( "c++ isn't a made-up language!" );

    if ( name.compareToIgnoreCase("c++") > 0 )
      System.out.println( name + " comes AFTER c++" );

    if ( name.compareToIgnoreCase("go") < 0 )
      System.out.println( name + " comes BEFORE go" );

    if ( name.compareToIgnoreCase("go") == 0 )
      System.out.println( "go isn't a made-up language!" );

    if ( name.compareToIgnoreCase("go") > 0 )
      System.out.println( name + " comes AFTER go" );

    if ( name.compareToIgnoreCase("java") < 0 )
      System.out.println( name + " comes BEFORE java" );

    if ( name.compareToIgnoreCase("java") == 0 )
      System.out.println( "Java isn't a made-up language!" );

    if ( name.compareToIgnoreCase("java") > 0 )
      System.out.println( name + " comes AFTER java" );

    if ( name.compareToIgnoreCase("lisp") < 0 )
      System.out.println( name + " comes BEFORE lisp" );

    if ( name.compareToIgnoreCase("lisp") == 0 )
      System.out.println( "lisp isn't a made-up language!" );

    if ( name.compareToIgnoreCase("lisp") > 0 )
      System.out.println( name + " comes AFTER lisp" );

    if ( name.compareToIgnoreCase("python") < 0 )
      System.out.println( name + " comes BEFORE python" );

    if ( name.compareToIgnoreCase("python") == 0 )
      System.out.println( "python isn't a made-up language!" );

    if ( name.compareToIgnoreCase("python") > 0 )
      System.out.println( name + " comes AFTER python" );

    if ( name.compareToIgnoreCase("ruby") < 0 )
      System.out.println( name + " comes BEFORE ruby" );

    if ( name.compareToIgnoreCase("ruby") == 0 )
      System.out.println( "ruby isn't a made-up language!" );

    if ( name.compareToIgnoreCase("ruby") > 0 )
      System.out.println( name + " comes AFTER ruby" );

    if ( name.compareToIgnoreCase("visualbasics") < 0 )
      System.out.println( name + " comes BEFORE visualbasics" );

    if ( name.compareToIgnoreCase("visualbasics") == 0 )
      System.out.println( "visualbasics isn't a made-up language" );

    if ( name.compareToIgnoreCase("visualbasics") > 0 )
      System.out.println( name + " comes AFTER visualbasics" );


  }
}
