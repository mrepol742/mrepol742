import java.util.Scanner;

class Math2 {

    public static void main(String[] sg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number:");
        int one = scan.nextInt();
        System.out.println("Input the another number:");
        int two = scan.nextInt();
        System.out.println(one % two == 0);
    }
}