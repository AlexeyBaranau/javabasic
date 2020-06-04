/*Task 3.  Write a Java program to print the following grid*/

package lesson2_homework;


import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер таблицы умножения");
        int size = sc.nextInt();
        int i = 1;
        int j = 1;
        while (i <= size && j <= size) {
            System.out.print((i*j) + " ");
            if (i == size) {
                System.out.println();
                j +=1;
                i = 0;
            }
            i++;
        }
    }
}