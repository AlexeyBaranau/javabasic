/*Task 11. Write a Java program to reverse an array of integer values.*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.*;

public class TASK11 {
    public static void main(String[] args) {
        System.out.println("Массив случайных чисел: ");
        int [] array = randomArray();
        printArray(array);
        reverseArray(array);
        System.out.println("Массив после копирования:");
        printArray(array);
    }
}