//package com.mrepol742.webvium.util;

import java.util.*;
import java.net.*;
//import com.mrepol742.webvium.annotation.Keep;

 class ProfanityFilter {

    private static String[] sg = new String[]{"PornHub" ,
            "PornTube" ,
            "ePorner" ,
            "PornHD" ,
            "Porn" ,
            "xHamster" ,
            "Motherless" ,
            "GotPorn" ,
            "RedTube" ,
            "4Tube" ,
            "Vporn" ,
            "xVideos" ,
            "YouPorn" ,
            "Beeg" ,
            "CollectionOfPorn" ,
            "SpankBang" ,
            "3Movs" ,
            "Tube8" ,
            "YouJizz" ,
            "DrTuber" ,
            "TXXX" ,
            "XNXX" ,
            "ClipHunter" ,
            "PornTrex" ,
            "YourPorn" ,
            "PornsLand" ,
            "VE-Porn" ,
            "Vidz7" ,
            "PornQD" ,
            "VRporn" ,
            "Bobs-Tube" ,
            "XXXstreams" ,
            "YesPornPlease" ,
            "YouFreePornTube" ,
            "Porn4Days" ,
            "PornHD8k" ,
            "UltraHorny" ,
            "PornHD6k" ,
            "WatchXXXFree" ,
            "PlusOne8" ,
            "TnaFlix" ,
            "PornRewind" ,
            "Sweext" ,
            "xTapes" ,
            "Vidz24" ,
            "RushPorn" ,
            "HDpornstarz" ,
            "CumLouder" ,
            "Fux" ,
            "PornPremieres" ,
            "LuxureTV" ,
            "PervertSlut" ,
            "PornCorn" ,
            "PornHD3x" ,
            "xKeezMovies" ,
            "Bubble" ,
            "SexGalaxy" ,
            "XOpenload" ,
            "NetPornSex" ,
            "HD-EasyPorn" ,
            "Palimas" ,
            "PornBraze" ,
            "SexTVx" ,
            "Sexu" ,
            "PhicaTube" ,
            "YourDailyPornVideos" ,
            "PornoVideosHub" ,
            "ShameLess" ,
            "HandJobHub" ,
            "ToBePorn" ,
            "YoungPornVideos" ,
            "AlotPorn" ,
            "XXvideoss" ,
            "JizzMan" ,
            "Slutload" ,
            "PandaMovie" ,
            "PornDish" ,
            "StreamingPorn" ,
            "RedPorn" ,
            "XXXstreams" ,
            "FullXXXMovies" ,
            "HDpornFull" ,
            "PussySpace" ,
            "GameOfPorn" ,
            "TGPdog" ,
            "PornStreams" ,
            "PornoBae" ,
            "PornVibe" ,
            "PalmTube" ,
            "FAkingsTV" ,
            "DVDtrailerTube" ,
            "JAVfinder" ,
            "StreamJAV" ,
            "JAVwhores" ,
            "vJAV" ,
            "JAVdoe" ,
            "HPjav" ,
            "JAVQD" ,
            "JAVfun" ,
            "WatchJAVonline" ,
            "JAVseen" ,
            "JAVout" ,
            "OhYeah1080" ,
            "JAVhd3x" ,
            "SexTop" ,
            "ShyAV" ,
            "Vpondo" ,
            "JAVleak" ,
            "JAVhd4k" ,
            "JAVbraze" ,
            "IVhunter" ,
            "YouAV" ,
            "JAV2be" ,
            "JAV-720p" ,
            "JAVdude" ,
            "KapLog" ,
            "iYotTube" ,
            "JavHD" ,
            "CrazyAsianGFs" ,
            "AsianGFvideos" ,
            "R18" ,
            "Erito" ,
            "SakuraLive" ,
            "LiveSexAsian" ,
            "Streamate" ,
            "ArabySexy" ,
            "FreeArabSexx" ,
            "AflamNeek" ,
            "SexAraby" ,
            "AflamSexHD" ,
            "AflamPorn" ,
            "SexSaoy" ,
            "ArabGFvideos" ,
            "TourOfBooty" ,
            "BlackGFS" ,
            "RoundAndBrown" ,
            "BrownBunnies" ,
            "MyEbonyGF" ,
            "BlackIsBetter" ,
            "MyFreeBlack" ,
            "ShesFreaky" ,
            "HomeGrownFr"};


private static String[] sgEncrypted = new String[]{
"cG9ybmh1Yg==",
"cG9ybnR1YmU=",
"ZXBvcm5lcg==",
"cG9ybmhk",
"cG9ybg==",
"eGhhbXN0ZXI=",
"bW90aGVybGVzcw==",
"Z290cG9ybg==",
"cmVkdHViZQ==",
"NHR1YmU=",
"dnBvcm4=",
"eHZpZGVvcw==",
"eW91cG9ybg==",
"YmVlZw==",
"Y29sbGVjdGlvbm9mcG9ybg==",
"c3BhbmtiYW5n",
"M21vdnM=",
"dHViZTg=",
"eW91aml6eg==",
"ZHJ0dWJlcg==",
"dHh4eA==",
"eG54eA==",
"Y2xpcGh1bnRlcg==",
"cG9ybnRyZXg=",
"eW91cnBvcm4=",
"cG9ybnNsYW5k",
"dmUtcG9ybg==",
"dmlkejc=",
"cG9ybnFk",
"dnJwb3Ju",
"Ym9icy10dWJl",
"eHh4c3RyZWFtcw==",
"eWVzcG9ybnBsZWFzZQ==",
"eW91ZnJlZXBvcm50dWJl",
"cG9ybjRkYXlz",
"cG9ybmhkOGs=",
"dWx0cmFob3JueQ==",
"cG9ybmhkNms=",
"d2F0Y2h4eHhmcmVl",
"cGx1c29uZTg=",
"dG5hZmxpeA==",
"cG9ybnJld2luZA==",
"c3dlZXh0",
"eHRhcGVz",
"dmlkejI0",
"cnVzaHBvcm4=",
"aGRwb3Juc3Rhcno=",
"Y3VtbG91ZGVy",
"ZnV4",
"cG9ybnByZW1pZXJlcw==",
"bHV4dXJldHY=",
"cGVydmVydHNsdXQ=",
"cG9ybmNvcm4=",
"cG9ybmhkM3g=",
"eGtlZXptb3ZpZXM=",
"YnViYmxl",
"c2V4Z2FsYXh5",
"eG9wZW5sb2Fk",
"bmV0cG9ybnNleA==",
"aGQtZWFzeXBvcm4=",
"cGFsaW1hcw==",
"cG9ybmJyYXpl",
"c2V4dHZ4",
"c2V4dQ==",
"cGhpY2F0dWJl",
"eW91cmRhaWx5cG9ybnZpZGVvcw==",
"cG9ybm92aWRlb3NodWI=",
"c2hhbWVsZXNz",
"aGFuZGpvYmh1Yg==",
"dG9iZXBvcm4=",
"eW91bmdwb3JudmlkZW9z",
"YWxvdHBvcm4=",
"eHh2aWRlb3Nz",
"aml6em1hbg==",
"c2x1dGxvYWQ=",
"cGFuZGFtb3ZpZQ==",
"cG9ybmRpc2g=",
"c3RyZWFtaW5ncG9ybg==",
"cmVkcG9ybg==",
"eHh4c3RyZWFtcw==",
"ZnVsbHh4eG1vdmllcw==",
"aGRwb3JuZnVsbA==",
"cHVzc3lzcGFjZQ==",
"Z2FtZW9mcG9ybg==",
"dGdwZG9n",
"cG9ybnN0cmVhbXM=",
"cG9ybm9iYWU=",
"cG9ybnZpYmU=",
"cGFsbXR1YmU=",
"ZmFraW5nc3R2",
"ZHZkdHJhaWxlcnR1YmU=",
"amF2ZmluZGVy",
"c3RyZWFtamF2",
"amF2d2hvcmVz",
"dmphdg==",
"amF2ZG9l",
"aHBqYXY=",
"amF2cWQ=",
"amF2ZnVu",
"d2F0Y2hqYXZvbmxpbmU=",
"amF2c2Vlbg==",
"amF2b3V0",
"b2h5ZWFoMTA4MA==",
"amF2aGQzeA==",
"c2V4dG9w",
"c2h5YXY=",
"dnBvbmRv",
"amF2bGVhaw==",
"amF2aGQ0aw==",
"amF2YnJhemU=",
"aXZodW50ZXI=",
"eW91YXY=",
"amF2MmJl",
"amF2LTcyMHA=",
"amF2ZHVkZQ==",
"a2FwbG9n",
"aXlvdHR1YmU=",
"amF2aGQ=",
"Y3Jhenlhc2lhbmdmcw==",
"YXNpYW5nZnZpZGVvcw==",
"cjE4",
"ZXJpdG8=",
"c2FrdXJhbGl2ZQ==",
"bGl2ZXNleGFzaWFu",
"c3RyZWFtYXRl",
"YXJhYnlzZXh5",
"ZnJlZWFyYWJzZXh4",
"YWZsYW1uZWVr",
"c2V4YXJhYnk=",
"YWZsYW1zZXhoZA==",
"YWZsYW1wb3Ju",
"c2V4c2FveQ==",
"YXJhYmdmdmlkZW9z",
"dG91cm9mYm9vdHk=",
"YmxhY2tnZnM=",
"cm91bmRhbmRicm93bg==",
"YnJvd25idW5uaWVz",
"bXllYm9ueWdm",
"YmxhY2tpc2JldHRlcg==",
"bXlmcmVlYmxhY2s=",
"c2hlc2ZyZWFreQ==",
"aG9tZWdyb3duZnI=",
};
/*
    @Keep
    private ProfanityFilter() {

    } */

/*
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("String[] sg = new String[]{");
        for (String sga: sg) {
             sb.append("\n");
             sb.append("\"");
             sb.append(Base64.getEncoder().encodeToString(sga.toLowerCase().getBytes()));
             sb.append("\",");
        }
        sb.append("\n};");
        System.out.println(sb.toString());
    }*/
/*
    public static void main(String[] args) throws MalformedURLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("input a valid url");
        String url = new URL(scan.nextLine()).getHost();
        for (String sg1 : sgEncrypted) {
            if (url.startsWith(new String(Base64.getDecoder().decode(sg1)))) {
                System.out.println("DETECTED... exiitng");
                System.exit(0);
            }
            System.out.println("Cheeking.......");
        }
    }*/

     public static void main(String[] args) {
 String enc = encode("Hello World", (char)95); 
 System.out.println(enc);
 System.out.println(encode(enc, (char)95));
     }
       
    
      public static String encode(String inputString, char xorKey) {
        StringBuilder outputString = new StringBuilder();
        int len = inputString.length();
        for (int i = 0; i < len; i++) {
            outputString.append((char) (inputString.charAt(i) ^ xorKey));
        }
        return outputString.toString();
    }

    public static boolean isProfanity(String dom) {
        for (String s: sg) {
             if (s.equals(dom)) {
                 return true;
             }
        }
        return false;
    }
}
    
    // Usage: ProfanityFilter.isProfanity(Base64.encode(Url.parse(url).getHost()))