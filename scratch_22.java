
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
     //   String[] sg = f("https://mrepol742.github.io/PROJECT-WEBVIUM/Server/IpAddress", "Houston we have a problem").split(";");
        System.out.println( f("https://mrepol742.github.io/PROJECT-WEBVIUM/Server/IpAddress", "Houston we have a problem"));
    }

    public static String f(String url, String problem) {
        try {
            if (url.startsWith("file://") || url.startsWith("content://")) {
                InputStream is = new FileInputStream(url);
                StringBuilder contentBuilder = new StringBuilder();
                Reader rr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(rr);
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    contentBuilder.append(sCurrentLine).append("\n");
                }
                br.close();
                is.close();
                rr.close();

                return contentBuilder.toString();
            } else {
                URL u = new URL(url);
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
                return cd.toString();
            }
        } catch (Exception ex) {

        }
        return problem;
    }

}