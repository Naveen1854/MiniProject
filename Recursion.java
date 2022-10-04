public class Recursion {
    static int count = 1;

    public static void main(String args[]) {
        printMessage();
    }

    static void printMessage() {
        if (count <= 5) {
            System.out.println("CSE is Best");
            count++;
            printMessage();
        }
    }
}