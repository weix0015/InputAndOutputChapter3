import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter a temperature in Celsius: ");

        Scanner in = new Scanner(System.in);
        double celsius = in.nextInt();
        double fahrenheit = celsius * 9/5 + 32;

        System.out.println((double) celsius + " C = " + (double) fahrenheit + " F");

    }
}
