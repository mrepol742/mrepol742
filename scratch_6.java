import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine().replaceAll(" ", "");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1 = Encode\n2 = Decode");
        int it = scanner1.nextInt();
        if (it == 1) {
            System.out.println(Base64.getEncoder().encodeToString(data.getBytes()));
        } else if (it == 2) {
            byte[] bytes = Base64.getDecoder().decode(data);
            StringBuilder stringBuilder = new StringBuilder();
            for (byte be : bytes) {
                stringBuilder.append((char) be);
            }
            System.out.println(stringBuilder.toString());
        } else {
            main(new String[]{"a"});
        }
    }
}