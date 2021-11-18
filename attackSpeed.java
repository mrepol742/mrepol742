import java.util.Scanner;

class attackSpeed {
    public static void main(String[] args) {;
      System.out.println("Enter the base attack speed: ");
      Scanner scan = new Scanner(System.in);
      double base = scan.nextDouble();
      System.out.println("Enter the bonus attack speed %: ");
      int bonus = scan.nextInt();
      System.out.println("Enter the level: ");
      int level = scan.nextInt();
      double attackspeed = base * (1 + (bonus / 100.00) * (level - 1));
      System.out.println("The character's current attack speed is " + Math.round(attackspeed * 1000 ) / 1000.0d);
    }
}