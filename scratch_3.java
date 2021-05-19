
import com.droidmj.webvium.security.Hash;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Scratch {
    public static void main(String[] args) {
        System.out.println(getObjectHash(new Date()));
    }

    public static String getObjectHash(Object object) {
        String a = "742";
        String b = Integer.toString(object.hashCode());
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyymmsshh", Locale.US);
        String currentDate = sdf.format(date);
        String total = a + b + currentDate;
        return Hash.a("SHA-1", total);
    }
}