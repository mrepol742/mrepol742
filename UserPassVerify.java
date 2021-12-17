import java.util.Scanner;

class UserPassVerify {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("\nEnter password: ");
        String password = scanner.nextLine();

        if (username.equals("rellian.del.r") && password.equals("r-del-rellian09")) {
            System.out.println("\nWelcome!");
        } else {
            System.out.println("\nTry Again!");
        }
    }
}