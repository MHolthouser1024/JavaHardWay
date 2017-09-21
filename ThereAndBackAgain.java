public class ThereAndBackAgain {
  public static void main( String[] args ) {
    System.out.println( "Here." );
    erebor();
    System.out.println( "Back first time." );
    //erebor();
    System.out.println( "Back second time." );
  }

  public static void erebor() {
    System.out.println( "There." );
  }
}
// 1.) Program doesn't compile if () are removed from first erebor function.
// 2.) If the second function call is removed there will be only one line with
// There and the erebor will be only called in line 4.
