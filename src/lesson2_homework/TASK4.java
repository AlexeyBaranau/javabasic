/*Task 4.  Write a Java program to calculate the average value of array elements.*/

package lesson2_homework;


public class TASK4 {
    public static void main(String[] args) {
        Integer arr[] = {14, 15, 25, 3, 41, 8, 9, 47, 83, 15, 7, 65};
        double sum = 0;
        int n = arr.length;
        System.out.println("Массив случайных чисел");
        Homework2Util.arrayToPrint(arr);
        for (Integer i : arr) {
            sum += i;
        }
        System.out.println();
        System.out.println("Среднее арифметическое значение массива");
           double average = sum / n;
        System.out.println(average);
    }
}