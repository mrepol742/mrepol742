import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

import com.mrepol742.webvium.content.Package;
import com.mrepol742.webvium.manifest.Permission;

class Scratch {
    public static void main(String[] args) {
        DownloadManager dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        DownloadManager.Request f = new DownloadManager.Request(Uri.parse("https://z-m-scontent.flos1-1.fna.fbcdn.net/v/t1.6435-9/fr/cp0/e15/q65/130758530_227764418760880_4030722256913586201_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=85a577&efg=eyJpIjoibyJ9&_nc_eui2=AeGUu2cDAjmJIAWBqnz3F1zhOA1vUa5OWx44DW9Rrk5bHnZJp8I2hkW_eKH8gfDJBYY0IBqhJ4uIRZ_NkwJkGjI_&_nc_ohc=ix0Sktj3CB0AX-t-VkD&_nc_ad=z-m&_nc_cid=1080&_nc_eh=c969504cecb872e289554074d72f19de&_nc_rml=0&_nc_ht=z-m-scontent.flos1-1.fna&tp=14&oh=19e5be2d37b429f83f93765ba8c22595&oe=60A9B60E"));
        f.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
        if (Build.VERSION.SDK_INT >= 30) {
            f.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "image.png");
        } else if (Build.VERSION.SDK_INT >= 23 && Permission.checkOnly(this, Permission.STORAGE)) {
            f.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "image.png");
        } else {
            f.setDestinationInExternalPublicDir(Package.c() + "/Downloads", "image.png");
        }
        DownloadManager.Query dmq = new DownloadManager.Query();
        dmq.setFilterById(dm.enqueue(f), 0);
    }
}