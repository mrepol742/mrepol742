class Scratch {
    public static void main(String[] args) {
String layout = "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title></title>" +
                "</head>" +
                "<body>" +
                "<script src=\"https://www.gstatic.com/firebasejs/8.4.3/firebase-app.js\"></script>" +
                "<script src=\"https://www.gstatic.com/firebasejs/8.4.3/firebase-analytics.js\"></script>" +
                "<script src=\"https://www.gstatic.com/firebasejs/8.4.3/firebase-auth.js\"></script>" +
                "<script src=\"https://www.gstatic.com/firebasejs/8.4.3/firebase-database.js\"></script>" +
                "<script>" +
                "var firebaseConfig = {apiKey: %1$s, " +
                "authDomain: %2$s, " +
                "projectId: %3$s, " +
                "storageBucket: %4$s, " +
                "messagingSenderId: %5$s, " +
                "appId: %6$s, " +
                "measurementId: %7$s " +
                "}; " +
                "firebase.initializeApp(firebaseConfig); " +
                "firebase.analytics(); " +
                "firebase.database().ref('messages/').push().set({ " +
                "    Subject: \"%8$s\", " +
                "    Message: \"%9$s\" " +
                "}); alert(\"confirmed\") " +
                "</script>" +
                "</body>" +
                "</html>";
System.out.println(String.format(layout, "Aaa", "bb", "cc", "dd", "ddd", "eee", "eee", "eee", "hggg"));
    }
}