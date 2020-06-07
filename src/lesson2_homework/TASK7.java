/*Task 7.  Write a Java program to remove a specific element from an array.*/

package lesson2_homework;


import java.util.Arrays;

import static lesson2_homework.Homework2Util.*;

public class TASK7 {
    public static void main(String[] args) {
        Integer arr[] = {15, 153, 3, 47, 66, 56, 574, 32, 45};
        printArray(arr);
        System.out.println(Arrays.toString(removeElement(arr, 47)));
        }

    }