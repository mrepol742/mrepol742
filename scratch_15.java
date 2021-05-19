import java.util.Date;

class Scratch {
    public static void main(String[] args) {
        Date dte=new Date();
        System.out.println(dte);
        long milliSeconds = dte.getTime();
        String strLong = Long.toString(milliSeconds);
        System.out.println(strLong);
        System.out.println(new Date(milliSeconds));
    }
}