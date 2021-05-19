import android.content.SharedPreferences;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class Scratch {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://github.com/mrepol742/Server/blob/master/webvium_urls.txt?raw=true");
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

            String[] arr = cd.toString().trim().split(";");

            String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

            int length = arr.length;
            for (int i = 0; i < length; i++) {
              System.out.println(abc[i]+"--"+arr[i] + abc[i]);
            }
        } catch (Exception en ) {

        }
    }
}