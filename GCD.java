import java.util.Scanner;

class GCD {

    public static void main(String[] args) {
        System.out.println("GCD.\n");
        System.out.print("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();
        System.out.println("The GCD of " + number + " and " + second + " is: " + findGCD(number, second));
    }

    public static int findGCD(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        return findGCD(i2, i % i2);
    }
}