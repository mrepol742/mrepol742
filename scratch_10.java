import java.util.Random;

class Scratch {
    public static void main(String[] args) {
        int height= 195;
        System.out.println(195/2+13);
    }

    private static int getWeightPercentage() {
        Random random = new Random();
        int limit = 20;
        int low = 10;
        return random.nextInt(limit-low) + low;
    }
}