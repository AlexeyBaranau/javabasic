/*Создайте программу с двумя переменными целого типа, присвойте им значения,
 если первая переменная больше второй, то увеличьте её значение на 3,
 иначе увеличьте значение второй переменной на 8.
 В конце программы выведите значения обоих чисел на экран.*/

package lesson1_homework;


import java.util.Scanner;

public class TASK14 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            a = a + 3;
        }
        else {
            b = b + 8;
        }
        System.out.println(a + " " + b);
    }
}



