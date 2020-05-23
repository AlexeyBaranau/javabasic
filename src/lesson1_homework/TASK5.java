/*Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)*/

package lesson1_homework;


public class TASK5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

    }

}
