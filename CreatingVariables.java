public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, income;
        double seconds, e, checking, savings;
        String firstName, lastName, title, bankName, streetName;

        x = 10;
        y = 400;
        age = 39;
        income = 45000;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        savings = 2000.57;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        bankName = "US Bank";
        streetName = "Acoma";

        System.out.println( "The variable x contains " + x );

        System.out.println( "The value " + y + " is stored in the variable y." );

        System.out.println( "The experiment took " + seconds + " seconds.");

        System.out.println( "A favorite irrational # is Euler's number: " + e );

        System.out.println( "Hopefully you have more than $" + checking + "!" );

        System.out.println( "My name's " + title + " " + firstName + lastName );

        System.out.println( "My income is " + income + ". The bank that handles my " + savings + " of savings is called " + bankName + " located on " +
        streetName + "." );
    }
}
