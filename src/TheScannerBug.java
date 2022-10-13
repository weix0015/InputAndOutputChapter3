import java.util.Scanner;

public class TheScannerBug {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);*/

        // The output will look like this:
            // Hello Grace Hopper, age 45

        /*System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);*/

        // This doesn't let you input your anem, and it immediately displays the output:
            // What is your name? Hello, age 45

        System.out.print("What is your age? ");
        int age = in.nextInt();
        in.nextLine(); // read the newline
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
