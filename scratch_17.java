import java.util.Arrays;

class Scratch {
    static int[] ia = {86, 50, 86, 105, 100, 109, 108, 49, 98, 81}; // an
    static int[] ib = {89, 50, 57, 116, 76, 109, 49, 121, 90, 88, 66, 118, 98, 68, 99, 48, 77, 105, 53, 51, 90, 87, 74, 50, 97, 88, 86, 116}; //pn
    public static void main(String[] args) {
        System.out.println(Arrays.toString("3dba522b41b589e4699a2d94e18bc856da6210258315a0bc51e8992fa10b42853644420258cf92d84b1068a93ee8002688d1826be3d54c1e99238f3aec774005".getBytes()));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i: ia) {
            stringBuilder.append((char)i);
        }
        System.out.println(stringBuilder.toString());
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[1];
        String methodName = e.getMethodName();
        System.out.println(methodName);
    }
}