package hashmap_hashset.arrayList_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //https://icancodeit.files.wordpress.com/2019/08/doubly-linked-list-data-structure.png

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Hue");
        linkedList.add("is");
        linkedList.add("coding");
        System.out.println(linkedList.get(2));//slower(Node+pointer)
        linkedList.add(3, "Java");//faster


        String[] words = new String[4];
        ArrayList<String> arrayList = new ArrayList<String>();// working like Array
        arrayList.add("Hue");
        arrayList.add("is");
        arrayList.add("coding");
        System.out.println(arrayList.get(2));// faster
        arrayList.add(3, "Java");//slower
    }
}
