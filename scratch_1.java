import android.os.Build;

import com.droidmj.webvium.BuildConfig;
import com.droidmj.webvium.app.BuildConfiguration;
import com.droidmj.webvium.content.Package;
import com.droidmj.webvium.util.AndroidVersion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Scratch {
    private static final String st = " ************* ";
    public static void main(String[] args) {
        b("aaa", "b");
    }

    private static void b(String log, String category) {
        if (a1 == null) {
            if (BuildConfiguration.Application.isDevelopment) {
                android.util.Log.d(Package.b(), log);
            }
            return;
        }
        Runnable p = () -> {
            try {
                File logFile = new File("a.txt");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("h:mm:ss", Locale.US);
                if (!logFile.exists()) {
                    if (logFile.createNewFile()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(logFile);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                        outputStreamWriter.append(st)
                                .append("Device Properties")
                                .append(st)
                                .append("\n")
                                .append("Operating System: ")
                                .append(AndroidVersion.getVersionName(Build.VERSION.SDK_INT))
                                .append("\n")
                                .append("SDK Version: ")
                                .append(Integer.toString(Build.VERSION.SDK_INT))
                                .append("\n")
                                .append("Manufacturer: ")
                                .append(Build.MANUFACTURER)
                                .append("\n")
                                .append("Model: ")
                                .append(Build.MODEL)
                                .append("\n\n\n")
                                .append(st)
                                .append("Webvium Properties")
                                .append("\n")
                                .append("Version Name: ")
                                .append(BuildConfig.VERSION_NAME)
                                .append("Version Code: ")
                                .append(Integer.toString(BuildConfig.VERSION_CODE))
                                .append("Build Type: ")
                                .append(BuildConfig.BUILD_TYPE)
                                .append("\n\n\n")
                                .append(st)
                                .append(simpleDateFormat.format(new Date()))
                                .append(st)
                                .append("\n")
                                .append(simpleDateFormat0.format(new Date()))
                                .append(" -| ")
                                .append(category)
                                .append(" -| ")
                                .append(log);
                        outputStreamWriter.close();
                        fileOutputStream.close();
                    }
                } else {
                    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM dd, yyyy", Locale.US);
                    FileWriter fileWriter = new FileWriter(logFile, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    if (simpleDateFormat1.format(logFile.lastModified()).equals(simpleDateFormat1.format(new Date()))) {
                        bufferedWriter.write("\n" + simpleDateFormat0.format(new Date()) + " -| " + category + " -| " + log);
                    } else {
                        bufferedWriter.write("\n\n\n" + st + simpleDateFormat.format(new Date()) + st + "\n" + simpleDateFormat0.format(new Date()) + " -| " + category + " -| " + log);
                    }
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (Exception ex) {
                android.util.Log.d(Package.b(), log);
            }
        };
        new Thread(p).start();
    }

    static class Builda {
        public static final String AAA = "test";
    }

}