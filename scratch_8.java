import java.util.Random;

class Scratch {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        int limit = 195;
        int low = 165;
        long timeDone = System.currentTimeMillis();
        System.out.println(random.nextInt(limit-low) + low);

        System.out.println(timeDone - time);


    }
}