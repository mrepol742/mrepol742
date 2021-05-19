import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

class Scratch {
    public static void main(String[] args)  {
        try {
            String mainurl = "https://amosayomide.ueuo.com/projects/apps/LoginActivity.php?e=aaa&p=ccc";
         String data = format(f(mainurl, "We have a problem"));
String[] firstSplt = splitter(data);
for (String split: firstSplt) {
    String[] secondSplit = split(split);
    System.out.println(secondSplit[0] + " is " + secondSplit[1]);
}

        } catch (Exception en) {

        }
    }

    public static String[] splitter(String string ) {
        return string.split(",");
    }

    public static String[] split(String data) {
        return data.split(":");
    }

    public static String format(String tobeformat) {
        return tobeformat.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\\{", "").replaceAll("}", "").replaceAll("\"", "");
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
