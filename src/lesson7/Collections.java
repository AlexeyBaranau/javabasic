package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            stringList.add("String № " + i);
        }
        System.out.println("Strings of arraylist");
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println( );
        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            linkedList.add("LinkedList string № " + i);
        }
            System.out.println("Strings of linkedlist");
            for (String s : linkedList) {
                System.out.println(s);
            }
    }
}
