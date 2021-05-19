import android.content.pm.PackageInfo;

class Scratch {
    public static void main(String[] args) {
        List<PackageInfo> apps = Context.getPackageManager().getInstalledPackages(0);
        for (PackageInfo packageinfo: apps) {

        }
    }
}