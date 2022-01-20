import java.util.Scanner;

class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial.\n");
        System.out.print("Enter a number to calculate the factorial: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return (i * factorial(i - 1));
    }
}