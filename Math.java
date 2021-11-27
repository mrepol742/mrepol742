import java.util.Scanner;

class Math {
    private static Scanner scan;

    public static void main(String[] sg) {
        scan = new Scanner(System.in);
        System.out.println("Choose options:\n");
        System.out.println("a    add");
        System.out.println("d    divide");
        System.out.println("m    multiply");
        System.out.println("s    subtract");
        System.out.println("e    exit\n");
        String opt = scan.next();
        switch (opt) {
            case "a":
            add();
            break;
            case "d":
            divide();
            break;
            case "m":
            multiply();
            break;
            case "s":
            subtract();
            break;
            case "e":
            exit();
            break;
            default:
            System.out.println("Error pick the right options here...");
            restart();
            break;
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void restart() {
         main(new String[]{"0"});
    }

    public static void add() {
        try {
            System.out.println("\n\nAddition:\nInput a number:"); 
            int one = scan.nextInt();
            System.out.println("Input another number:");
            int two = scan.nextInt();
            int sum = one + two;
            System.out.println(String.format("The sum of %1$d  and %2$d is: %3$d\n", one, two, sum));
        } catch (Exception exc) {
            System.out.println("Error input a valid number...\n");
        }
        restart();
    }

    public static void divide() {
        try {
            System.out.println("\n\nDivision:\nInput a number:"); 
            int one = scan.nextInt();
            System.out.println("Input another number:");
            int two = scan.nextInt();
            int sum = one / two;
            System.out.println(String.format("The division of %1$d  and %2$d is: %3$d\n", one, two, sum));
        } catch (Exception exc) {
            System.out.println("Error input a valid number...\n");
        }
        restart();
    }

    public static void subtract() {
        try {
            System.out.println("\n\nSubtraction:\nInput a number:"); 
            int one = scan.nextInt();
            System.out.println("Input another number:");
            int two = scan.nextInt();
            int sum = one - two;
            System.out.println(String.format("The difference of %1$d  and %2$d is: %3$d\n", one, two, sum));
        } catch (Exception exc) {
            System.out.println("Error input a valid number...\n");
        }
        restart();
    }

    public static void multiply() {
        try {
            System.out.println("\n\nMultiplication:\nInput a number:"); 
            int one = scan.nextInt();
            System.out.println("Input another number:");
            int two = scan.nextInt();
            int sum = one * two;
            System.out.println(String.format("The multiply of %1$d  and %2$d is: %3$d\n", one, two, sum));
        } catch (Exception exc) {
            System.out.println("Error input a valid number...\n");
        }
        restart();
    }
}