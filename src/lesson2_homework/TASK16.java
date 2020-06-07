/*Task 16. Write a Java program to remove duplicate elements from an array.*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.*;
import static lesson2_homework.Homework2Util.printArray;

public class TASK16 {
    public static void main(String[] args) {
        int [] arr = {14, 15, 123, 42, 36, 97, 2, 7, 53, 28, 42, 18};
        System.out.println("Массив : ");
        printArray(arr);
        deleteDuplicateElements(arr);
    }
}