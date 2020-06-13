package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsTwo {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        ArrayList<String> stringList = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            stringList.add("String № " + i);
        }
        stringList.remove(stringList.size()/2);
        System.out.println(System.currentTimeMillis() - currentTimeMillis + " ms operations processed");
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < 10000; i++){
            linkedList.add("LinkedList string № " + i);
        }
            linkedList.remove(linkedList.size()/2);
        System.out.println(System.currentTimeMillis() - currentTimeMillis1 + " ms operations processed");
    }
}
