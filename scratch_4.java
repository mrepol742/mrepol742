import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sg = scanner.nextLine();

        System.out.println(b(sg, 12));
        System.out.println(b12(b(sg, 12), 12));
    }

    public static String b(String text, int s) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String b12(String text, int s) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) ( ( (int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
}