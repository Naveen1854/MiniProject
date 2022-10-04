import java.util.Scanner;

/**
 * Java Program to take input from user.
 */
public class TakingInput {
    public static void main(String[] args) {
        char c;
        int v_int;
        float v_float;
        String str;

        Scanner scanner;
        scanner = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter a String");
        str = scanner.nextLine();

        System.out.println("Enter a Character");
        c = scanner.next().charAt(0);

        System.out.println("Enter an Integer");
        v_int = scanner.nextInt();

        System.out.println("Enter a Float");
        v_float = scanner.nextFloat();
        scanner.close();

        // Printing data entered by user
        System.out.println("You Entered Following Data:");
        System.out.format("Char : %c\n", c);
        System.out.format("Integer : %d\n", v_int);
        System.out.format("Float : %f\n", v_float);
        System.out.format("String : %s", str);
    }
}