/*Task 6.  Write a Java program to find the index of an array element.*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.*;

public class TASK8 {
    public static void main(String[] args) {
        System.out.println("Массив случайных чисел: ");
        int [] array = randomArray();
        printArray(array);
        int [] copyArray = Arrays.copyOf(array, array.length);
        System.out.println("Массив после копирования:");
        printArray(copyArray);
    }
}