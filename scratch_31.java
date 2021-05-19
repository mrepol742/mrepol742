class Scratch {
    public static void main(String[] args) {
        String sg = "{\"-M_g0mjWtDXg07rsBu_b\":{\"Log\":\"Empty\",\"Message\":\"Getty gift ux DT gftt\",\"Subject\":\"gggggg\"},\"-M_g1IPr6UnmKvRPHncD\":{\"Log\":\"Empty\",\"Message\":\"please work for ducks sake\",\"Subject\":\"gggggg\"},\"-M_kKICHjFM7cqB3FMNl\":{\"Log\":\"Empty\",\"Message\":\"Shshhshhshs\",\"Subject\":\"TEst \"},\"-M_oDjRnjah1aV22VFx4\":{\"Log\":\"Empty\",\"Message\":\"S\",\"Subject\":\"stjdjrjrn\"},\"-M_oEQqab6BnKZflmf7B\":{\"Log\":\"Empty\",\"Message\":\"S\",\"Subject\":\"stjdjrjrn\"},\"-M_oE_X3PCt84J_p2uka\":{\"Log\":\"Empty\",\"Message\":\"S\",\"Subject\":\"stjdjrjrn\"},\"-M_oEgHG1MhRVGQiJaWc\":{\"Log\":\"java.lang.NullPointerExceptionSCAPE Attempt to read from field 'java.util.ArrayList com.mrepol742.webvium.$Yn.$0' on a null object reference\\n\\tat com.mrepol742.webvium.$Qs.run(SCAPE2)\\n\\tat android.os.Handler.handleCallback(Handler.javaSCAPE836)\\n\\tat android.os.Handler.dispatchMessage(Handler.javaSCAPE103)\\n\\tat android.os.Looper.loop(Looper.javaSCAPE203)\\n\\tat android.app.ActivityThread.main(ActivityThread.javaSCAPE6251)\\n\\tat java.lang.reflect.Method.invoke(Native Method)\\n\\tat com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.javaSCAPE1063)\\n\\tat com.android.internal.os.ZygoteInit.main(ZygoteInit.javaSCAPE924)\\n\",\"Message\":\"okokndsnsjsjsbsbshshshehsb\",\"Subject\":\"okokok\"},\"-M_olVUu9F-nzejWyQs1\":{\"Log\":\"Empty\",\"Message\":\"S\",\"Subject\":\"stjdjrjrn\"},\"-M_uKUOHlpZj0-wXtLWA\":{\"Log\":\"Empty\",\"Message\":\"Shshhshhshs\",\"Subject\":\"TEst \"},\"-M_xswhvn3k-UdJHgsnu\":{\"Log\":\"Empty\",\"Message\":\"Shshhshhshs\",\"Subject\":\"TEst \"}}";
        String[] data1 = sg.replaceAll("\\{", "\n").replaceAll("}", "").split(",");
        for (String data: data1) {
            String[] second = data.replaceAll("\"", "").split(":");
            for (int i = 0; i < second.length; i++) {
                switch (second[i].trim()) {
                    case "Log":
                        System.out.println("Log: " + second[i + 1]);
                        break;
                    case "Subject":
                        System.out.println("Subject: " + second[i + 1]);
                        break;
                    case "Message":
                        System.out.println("Message: " + second[i + 1] + "\n\n");
                        break;
                }
            }
        }
    }

}