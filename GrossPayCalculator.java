import java.util.Scanner;

class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Enter employee name:");
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.nextLine();
        System.out.println("Press F for Full Time or P for Part Time:");
        switch (scanner.next()) {
            case "F":
            System.out.println("--- Full Tome Employee ---");
            System.out.println("Enter Basic Pay:");
            double salary = scanner.nextDouble();
            System.out.println("\nEmployee Name: " + employeeName + "\nBasic Pay: " + Double.toString(salary));
            System.out.println("\nGross Pay: " + Double.toString(salary));
            break;
            case "P":
            System.out.println("--- Part Time Employee ---");
            System.out.println("Enter rate per hour:");
            double rate = scanner.nextDouble();
            System.out.println("Enter no. of hours worked:");
            int hours = scanner.nextInt();
            System.out.println("Enter no. of overtime:");
            int overtime = scanner.nextInt();
            double basicPay = hours * rate;
            double overtimePay = overtime * (rate * 1.25);
            double grossPay = basicPay + overtimePay;
            System.out.println("\nEmployee Name: " + employeeName + "\nBasic Pay: " + Double.toString(basicPay) + "\nOvertime Pay: " + Double.toString(overtimePay));
            System.out.println("\nGross Pay: " + Double.toString(grossPay));
            break;
            default:
            System.out.println("Invalid letter.");
            break;
        }
    }
}