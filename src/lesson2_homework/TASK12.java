/*Task 12. Write a Java program to find the duplicate values of an array of integer values.*/

package lesson2_homework;


import static lesson2_homework.Homework2Util.*;

public class TASK12 {
    public static void main(String[] args) {
        int [] arr = {15, 68, 44, 3, 15, 94, 35};
        System.out.println("Массив чисел: ");
        printArray(arr);
        bubbleSort(arr);
        findRepeatingIntElements(arr);
    }
}