/*Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
        что сила тяжести равна 16% от силы тяжести на Земле.*/

package lesson1_homework;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        System.out.println("Введите массу человека на Земле в кг ");
        Scanner mEarth = new Scanner(System.in);
        double pMoon = mEarth.nextDouble() * 9.81 * 0.17;
        System.out.println("Вес человека на Луне равен " + pMoon + " H");

    }

}
