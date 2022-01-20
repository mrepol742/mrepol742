import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("EvenOrOdd.\n");
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if ((number % 2) == 0) {
            System.out.println(number + " is an even number.");
        } else {
              System.out.println(number + " is an odd number.");
        }
    }
}