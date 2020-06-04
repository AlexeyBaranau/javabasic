/*Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
        что сила тяжести равна 16% от силы тяжести на Земле.*/

package lesson1_homework;

import java.util.Scanner;

public class TASK1 {
    public static final double GRAVITY = 9.81;
    public static final double MOON_GRAVITY = 0.16;

    public static void main(String[] args) {

        System.out.println("Введите массу человека на Земле в кг ");
        Scanner mEarth = new Scanner(System.in);
        double pMoon = mEarth.nextDouble() * GRAVITY * MOON_GRAVITY;
        System.out.println("Вес человека на Луне равен " + pMoon + " H");
    }
}
