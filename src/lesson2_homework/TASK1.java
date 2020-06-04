/*Task 1.  Write a Java program to sort a numeric array and a string array.*/

package lesson2_homework;


import java.util.Arrays;
import java.util.Collections;

public class TASK1 {
    public static void main(String[] args) {
        Integer arr[] = {14, 15, 25, 3, 41, 8, 9, 47, 83, 15, 7, 65};
        String [] cities = {"Gomel", "Minsk", "Brest", "Grodno", "Vitebsk", "Mogilev"};
        System.out.println("Массив чисел");
        Homework2Util.arrayToPrint(arr);
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Массив случайных чисел отсортирован по возрастанию");
        Homework2Util.arrayToPrint(arr);
        System.out.println();
        System.out.println("Города в алфавитном порядке");
        Arrays.sort(cities);
        Homework2Util.arrayToPrint(cities);
        }
    }