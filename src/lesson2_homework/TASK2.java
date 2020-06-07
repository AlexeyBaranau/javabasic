/*Task 2.  Write a Java program to sum values of an array.*/

package lesson2_homework;


public class TASK2 {
    public static void main(String[] args) {
        int arr[] = {14, 15, 25, 3, 41, 8, 9, 47, 83, 15, 7, 65};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма чисел массива " + sum);
    }
}