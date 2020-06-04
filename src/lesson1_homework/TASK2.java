/*Напишите метод, который будет увеличивать каждый элемент массива на 10%.*/


package lesson1_homework;


import java.util.Arrays;

public class TASK2 {
    public static void main(String[] args) {
        double arr [] = {15, 25, 2, 3, 46, 12, 8, 62};
        System.out.println("Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array increased by 10 percent:");
        increaseArrby10percent(arr);
    }

    public static void increaseArrby10percent(double[] mas) {
        final double multiplicator = 0.1;
        if (mas != null) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] += mas[i] * multiplicator;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}

