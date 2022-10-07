package mutable_Immutable_String_StringBuilder_StringBuffer;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
//        //---There are 2 ways to instantiate a string
//        String str1 = "ABC";
//        String str2 = new String("ABC");
//
//        //---String is immutable(get the reference from the String pool)
//        String str3 = "AB";
//        str3 = "ABC";
//        str3 += 'D'; //=> str3 is ABCD and the old ABC is discarded to garbage collection
//                     //=> JVM saves a lot of memory to use
//
//        //---StringBuffer and StringBuilder are mutable objects in Java
//        StringBuffer stringBuffer = new StringBuffer("ABC");
//       // StringBuilder stringBuilder = new StringBuilder("ABC");
//
//        stringBuffer.append("DE");
//       // stringBuilder.append("D");
//
//        String s = "ABCDE";
//        System.out.println(s == stringBuffer.toString().intern()); // note


        //--- StringBuffer is synchronized when StringBuilder is not
        //=> StringBuilder is faster than StringBuffer
        System.gc();
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time taken:" + (end-start));
        System.out.println("Memory used: "+ (endMemory-startMemory));
//        Time taken:881
//        Memory used: 153628560

    }
}
