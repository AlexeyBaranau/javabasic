/*Task 1.  Write a Java program to sort a numeric array and a string array.*/

package lesson2_homework;


import java.util.Arrays;
import java.util.Collections;

import static lesson2_homework.Homework2Util.*;

public class TASK1 {
    public static void main(String[] args) {
        Integer arr[] = {14, 15, 25, 3, 41, 8, 9, 47, 83, 15, 7, 65};
        String [] cities = {"Gomel", "Minsk", "Brest", "Grodno", "Vitebsk", "Mogilev"};
        System.out.println("Массив чисел");
        printArray(arr);
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Массив случайных чисел отсортирован по возрастанию");
        printArray(arr);
        System.out.println();
        System.out.println("Города в алфавитном порядке");
        Arrays.sort(cities);
        printArray(cities);
        }
    }