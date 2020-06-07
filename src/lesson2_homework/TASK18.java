/*Task 18. Write a Java program to find the second smallest element in an array.*/

package lesson2_homework;


import static lesson2_homework.Homework2Util.*;
import static lesson2_homework.Homework2Util.printArray;
import static lesson2_homework.Homework2Util.randomArray;

public class TASK18 {
    public static void main(String[] args) {
        int [] arr = randomArray();
        System.out.println("Массив : ");
        printArray(arr);
        secondSmallestElement(arr);
    }
}