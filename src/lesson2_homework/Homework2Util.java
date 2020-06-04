package lesson2_homework;

import java.net.Inet4Address;

public class Homework2Util {

    public static <T> void arrayToPrint(T[] elements) {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] randomArray () {
        int[] array = new int [15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }
    public static void printArray (int [] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
