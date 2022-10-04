import java.util.*;

public class ASCII {

    // main method
    public static void main(String[] args) {
        // Scanner class object created to take input.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);
        sc.close();
        int code = letter;
        System.out.println("ASCII value of " + letter + " is: " + code);
    }
}