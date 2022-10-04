public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 54, b = 18;
        System.out.println("--Before swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        int temp = a;
        a = b;
        b = temp;

        // print the values of number after swapping
        System.out.println("\n\n--After swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}