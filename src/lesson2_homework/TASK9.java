/*Task 9.  Write a Java program to insert an element (specific position) into an array.*/

package lesson2_homework;


import java.util.Arrays;
import java.util.Scanner;

import static lesson2_homework.Homework2Util.*;

public class TASK9 {
    public static void main(String[] args) {
        System.out.println("Массив случайных чисел: ");
        int [] array = randomArray();
        int [] newArray = new int [array.length + 1];
        printArray(array);
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите позицию в массиве от 0 до 15: ");
        int position = sc.nextInt();
        System.out.print("Какое число хотите внести в массив: ");
        int value = sc.nextInt();
        System.arraycopy(array, 0, newArray, 0, array.length);
        if (position < newArray.length) {
            System.arraycopy(newArray, position, newArray, position + 1, newArray.length - 1 - position);
            newArray[position] = value;
            printArray(newArray);
        }
        else {
            System.out.println("Такой позиции не существует в массиве");
        }

    }
}