import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Scratch {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy | hh:mm:ss", Locale.US);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}