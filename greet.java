// package com.mrepol742.webvium.util;

// import com.mrepol742.webvium.annotation.Keep;

  import java.text.SimpleDateFormat;
  import java.util.Locale;
  import java.util.Date;
// public class Greet {

   /*
   @Keep
   private Greet {

   }
   */

   class greet {

        public static void main(String[] sg) {
            SimpleDateFormat sdf = new SimpleDateFormat("HHmm", Locale.US);
            try {
                int date = Integer.parseInt(sdf.format(new Date()));
                if (date >= 1800) {
                    System.out.println("Good Night");
                } else if (date >= 1200) {
                    System.out.println("Good afternoon");
                } else {
                    System.out.println("Good Morning");
                }
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
        }

   }