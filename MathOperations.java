public class MathOperations {
    public static void main ( String[] args ) {
        int a, b, c, d, e, f, g, h;
        double w, x, y, z;
        String one, two, both;

        a = 10;
        b = 27;
        System.out.println( "a is " + a + ", b is " + b );

        c = a + b;
        System.out.println( "a+b is " + c );
        d = a - b;
        System.out.println( "a-b is " + d );
        e = a+b*3;
        System.out.println( "a+b*3 is " + e );
        f = b / 2;
        System.out.println( "b/2 is " + f );
        g = b % 10;
        System.out.println( "b%10 is " + g );

        x = 1.1;
        System.out.println( "\nx is " + x );
        y = x*x;
        System.out.println( "x*x is " + y);
        z = b / 2;
        System.out.println( "b/2 is " + z);
        System.out.println();

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println( both );

        h = 20;
        System.out.println( "h is " + h );
        w = h / 3;
        System.out.println( "h/3 is " + w );
        x = h * 9;
        System.out.println( "h*9 is " + x);
        y = h % 6;
        System.out.println( "h%6 is " + y );
        z = h + b / 8;
        System.out.println( "h+b/8 is " + z );

    }
}