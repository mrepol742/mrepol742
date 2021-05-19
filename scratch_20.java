class Scratch {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        new Thread(runnable).start();
    }
}