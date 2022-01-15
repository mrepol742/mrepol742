import java.util.Scanner;

class Metrics {
    private static Scanner scan;
    
    public static void main(String[] args) {
        System.out.println("Conversion System of the Metric Unit of Measurement");
        System.out.println("\nA. Meter to Millimeters\nB. Millimeters to Centimeters\nC. Meter to Kilometer\nD. Gram to Miligrams\nE. Kilograms to Grams\nF. Liter to Millimeters\nG. Exit");
        System.out.print("\nChoose actions: ");
        scan = new Scanner(System.in);
        String data = scan.next().toLowerCase();
        switch (data) {
            case "a":
                meterToMillimeters();
            break;
            case "b":
                millimetersToCentimeters();
            break;
            case "c":
                meterToKilometer();
            break;
            case "d":
                gramToMilligrams();
            break;
            case "e":
                kilogramsToGrams();
            break;
            case "f":
                literToMillimeters();
            break;
            case "g":
            default: 
                exit();
                break;
        }
    }
    
    private static void meterToMillimeters() {
        System.out.println("\nMeter to Millimeters");
        System.out.print("Enter meter: ");
        int meter = scan.nextInt();
        System.out.println(String.format("The millimeters of %1$s is: %2$s\n\n", meter, meter * 1000));
        restart();
    }
    
    private static void millimetersToCentimeters() {
        System.out.println("\nMillimeters to Centimeters");
        System.out.print("Enter millimeters: ");
        int centi = scan.nextInt();
        System.out.println(String.format("The centimeters of %1$s is: %2$s\n\n", centi, centi / 10));
        restart();
    }
    
    private static void meterToKilometer() {
        System.out.println("\nMeter to Kilometer");
        System.out.print("Enter meter: ");
        double meter = scan.nextDouble();
        System.out.println(String.format("The kilometer of %1$s is: %2$s\n\n", meter, meter / 1000));
        restart();
    }
    
    private static void gramToMilligrams() {
        System.out.println("\nGram to Milligrams");
        System.out.print("Enter gram: ");
        int gram = scan.nextInt();
        System.out.println(String.format("The gram of %1$s is: %2$s\n\n", gram, gram * 1000));
        restart();
    }
    
    private static void kilogramsToGrams() {
        System.out.println("\nKilograms to Grams");
        System.out.print("Enter kilograms: ");
        int kilo = scan.nextInt();
        System.out.println(String.format("The grams of %1$s is: %2$s\n\n", kilo, kilo * 1000));
        restart();
    }
    
    private static void literToMillimeters() {
        System.out.println("\nLiter to Millimeters");
        System.out.print("Enter liter: ");
        long liter = scan.nextLong();
        System.out.println(String.format("The liter of %1$s is: %2$s\n\n", liter, liter * 1000000));
        restart();
    }
    
    private static void exit() {
        System.exit(0);
    }
    
    private static void restart() {
        main(new String[]{"."});
    }
}