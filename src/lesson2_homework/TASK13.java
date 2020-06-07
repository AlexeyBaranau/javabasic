/*Task 13. Write a Java program to find the duplicate values of an array of string values.*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.findRepeatingStringElements;
import static lesson2_homework.Homework2Util.printArray;

public class TASK13 {
    public static void main(String[] args) {
        String [] arr = {"Java", "Class", "Generic", "Enum", "Class", "Method"};
        System.out.println("Массив: ");
        printArray(arr);
        Arrays.sort(arr);
        findRepeatingStringElements(arr);
    }
}