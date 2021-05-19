class Scratch {
    public static void main(String[] args) {
        System.out.println(encryptDecrypt("hahahahha", (char) 5));
        System.out.println(encryptDecrypt("mdmdmdmmd", (char) 5));
    }

    public static String encryptDecrypt(String inputString, char xorKey) {
        StringBuilder outputString = new StringBuilder();
        int len = inputString.length();
        for (int i = 0; i < len; i++) {
            outputString.append((char) (inputString.charAt(i) ^ xorKey));
        }
        return outputString.toString();
    }
}