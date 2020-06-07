/*Task 5.  Write a Java program to test if an array contains a specific value.*/

package lesson2_homework;


import java.util.Scanner;

import static lesson2_homework.Homework2Util.*;

public class TASK5 {
    public static void main(String[] args) {
        Integer arr[] = {14, 18, 25, 3, 41, 8, 9, 47, 83, 15, 7, 65};
        System.out.println("Массив чисел:");
        printArray(arr);
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println();
        boolean b = false;
        for (Integer element : arr) {
               if (a == element) {
                   System.out.println("Введенное число есть в массиве");
                   b = true;
               }
        }
        if (!b) {
            System.out.println("Введенного числа нет в массиве");
        }
    }
}
