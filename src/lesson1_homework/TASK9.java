/*Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
 чтобы значение первой оказалось во второй, а второй - в первой.*/

package lesson1_homework;


public class TASK9 {
    public static void main(String[] args) {
       int c;
       int a = 1, b = 5;
       c = a;
       a = b;
       b = c;
        System.out.println(a + " " + b);
    }
}



