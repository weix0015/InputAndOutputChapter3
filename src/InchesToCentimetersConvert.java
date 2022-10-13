import java.util.Scanner;

public class InchesToCentimetersConvert {
    public static void main(String[] args) {
        //int inch;
        //double cm;

        double cmPerInch = 2.54;
        //cm = inch * cmPerInch;
        final double CM_PER_INCH = 2.54;

        int inch = 100;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);

        Scanner in = new Scanner(System.in);
        System.out.print("How many inches? ");

        inch = in.nextInt();
        cm = inch * 2.54;

        System.out.print(inch + " inches = ");
        System.out.println(cm + " cm");

        System.out.print(4.0 / 3.0);
        System.out.printf(" Four thirds = %.3f ", 4.0 / 3.0);

        // 3.5 Formatting Output Chapter 3
        // %d Integer in base 10 ("decimal") 12345
        // %,d Integer with comma separators 12,345
        // %08d Padded with zeros, at least 8 digits wide 00012345
        // %f Floating-point number 6.789000
        // %.2f Rounded to 2 decimal places 6.79
        // %s String of characters "Hello"
        // %x Integer in base 16 ("hexadecimal") bc614e

        // 3.6 Reading Error Messages
        System.out.print(" inches = %d " + inch); // error

        // 3.7 Type Cast Operators
        //inch = cm / CM_PER_INCH; // syntax error

        //double pi = 3.14159;
        //int x = (int) pi;

        //String str = "3";
        //int x = (int) str; // error: incompatible types

        //double pi = 3.14159;
        //double x = (int) pi * 20.0; // result is 60.0, not 62.0

        // convert centimeters to inches:
        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm = %d in\n", cm, inch);

        // 3.8 Remainder Operator
        //feet = 76 / 12; // quotient
        //inches = 76 % 12; // remainder
    }
}

