import java.util.Random;

class Scratch {

    public static void main(String[] args) {
        System.out.println(b(133, 65, 122));
    }

    public static String b(int targetStringLength, int leftLimit, int rightLimit) {
        StringBuilder buffer = new StringBuilder(targetStringLength);
        int i = 0;
        Random random = new Random();
        while (i < targetStringLength) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            if (randomLimitedInt <= 90 || randomLimitedInt >= 98) {
                buffer.append((char)randomLimitedInt);
            }
            i++;
        }
        return buffer.toString();
    }
}