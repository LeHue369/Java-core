package hashmap_hashset.hashmap;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class EX1 {
    public static void main(String[] args) {
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();

        HashMap<String, String> happy = new HashMap<String, String>();
        for(long i = 0; i<1000000; i++){
           if(i%2==0) happy.put(Long.toString(i), Long.toString(i));
           else happy.put(Long.toString(i-1), Long.toString(i-1));
        }

        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time taken:" + (end-start));
        System.out.println("Memory used: "+ (endMemory-startMemory));
    }
}
