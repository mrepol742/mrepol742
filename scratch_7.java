class Scratch {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception en) {
            System.out.println(en.getClass().getName());
        }
    }
}