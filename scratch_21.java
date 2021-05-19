import android.content.SharedPreferences;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Scratch {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                URL u = new URL("https://luea.000webhostapp.com/mj/useragent.php");
                URLConnection is = u.openConnection();
                InputStream inputStream = is.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader c = new BufferedReader(inputStreamReader);
                String tf5;
                StringBuilder cd = new StringBuilder();
                while ((tf5 = c.readLine()) != null) {
                    cd.append(tf5).append("\n");
                }
                c.close();
                inputStreamReader.close();
                inputStream.close();
                System.out.println(cd.toString());
            } catch (Exception en) {
en.printStackTrace();
            }
        };
        new Thread(runnable).start();
    }
}