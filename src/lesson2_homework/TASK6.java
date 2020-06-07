/*Task 6.  Write a Java program to find the index of an array element.*/

package lesson2_homework;


import java.util.Arrays;
import java.util.Scanner;

import static lesson2_homework.Homework2Util.*;

public class TASK6 {
    public static void main(String[] args) {
        Integer arr[] = {15, 153, 3, 47, 66, 56, 574, 32, 45};
        System.out.println("Массив чисел:");
        printArray(arr);
        System.out.println("Введите число индекс, которого хотите узнать: ");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        System.out.println("Индекс числа");
        System.out.println(Arrays.asList(arr).indexOf(a));
    }
}