import java.util.Scanner;

class UserPassVerifyWithRestrictions {
    private static int temp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals("rellian.del.r") && password.equals("r-del-rellian09")) {
            System.out.println("Welcome!\n\n");
        } else {
            temp++;
            if (temp > 2) {
                System.exit(0);
            }
            System.out.println("Try Again!\n\n");
            main(new String[]{"0"});
        }
    }
}