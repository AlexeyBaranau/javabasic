/*Task 14. Write a Java program to find the common elements between two arrays (string values).*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.*;
import static lesson2_homework.Homework2Util.printArray;

public class TASK15 {
    public static void main(String[] args) {
        String [] arr = {"Java", "Class", "Generic", "Enum", "Class", "Method"};
        String [] arr1 = {"Car", "Lesson", "Dog", "Cat", "Task", "Java"};
        System.out.println("Массив 1: ");
        printArray(arr);
        System.out.println("Массив 2: ");
        printArray(arr1);
        Arrays.sort(arr);
        Arrays.sort(arr1);
        findRepeatingStringElements(arr, arr1);
    }
}