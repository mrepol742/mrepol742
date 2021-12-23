import java.util.Scanner;

class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println("<------ Factorial Calculator ------>");
        for (int i = 0; i < 5; i++) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter a positive integer:");
             int integer = scanner.nextInt();
             if (integer >= 0) {
                int fact = 1;
                StringBuilder stringBuilder = new StringBuilder(Integer.toString(integer));
                stringBuilder.append("! =");
                for (int j = 1; j <= integer; j++) {
                   fact = fact*j;
                   stringBuilder.append(" ");
                   stringBuilder.append(Integer.toString(j));
                   if (j != integer) {
                       stringBuilder.append(" x");
                   }
                }
                System.out.println(stringBuilder.toString());
                System.out.println("The Factorial of " + integer + " is: " + fact);
             } else {
                 System.out.println("Invalid Input! Program Stopped!");
                 break;
             }
        }
    }
}