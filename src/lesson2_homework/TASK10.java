/*Task 10. Write a Java program to find the maximum and minimum value of an array.*/

package lesson2_homework;


import static lesson2_homework.Homework2Util.*;

public class TASK10 {
    public static void main(String[] args) {
        int[] arr = randomArray();
        printArray(arr);
        int max = arr[0];
        int min = arr [0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr [i];
            if (arr [i] < min) min = arr [i];
        }
        System.out.println();
        System.out.println("Максимальное значение массива " + max);
        System.out.println("Минимальное значение массива " + min);
        }
    }