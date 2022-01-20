import java.util.Scanner;

class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci.\n");
        System.out.print("Enter a number to start: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i;
        System.out.println("Fibonacci series up to " + number + " numbers.");
        for (i = 1; i <= number; i++) {
            System.out.println(fibonacci(i) + "");
        }
    }

    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}