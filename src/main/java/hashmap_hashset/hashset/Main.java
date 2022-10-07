package hashmap_hashset.hashset;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Using hashset when we don't want to contain duplicate values
public class Main {
    public static void main(String[] args) {
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();
        HashSet<String> happy = new HashSet<String>();
        for(long i = 0; i<1000000; i++){
           if(i%2==0) happy.add(Long.toString(i));
           else happy.add(Long.toString(i-1));
        }
        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time taken:" + (end-start));
        System.out.println("Memory used: "+ (endMemory-startMemory));

    }
}
