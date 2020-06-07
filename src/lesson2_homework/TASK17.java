/*Task 17. Write a Java program to find the second largest element in an array.*/

package lesson2_homework;


import static lesson2_homework.Homework2Util.*;
import static lesson2_homework.Homework2Util.printArray;

public class TASK17 {
    public static void main(String[] args) {
        int [] arr = randomArray();
        System.out.println("Массив : ");
        printArray(arr);
        secondHighestElement(arr);
    }
}