/*Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
 Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
 Минимум, максимум и шаг указываются пользователем (можно захардкодить).*/

package lesson1_homework;


public class TASK16 {
    public static void main(String[] args) {
        for (int i = 10; i <= 55; i += 5) {
            System.out.print(i + " ");
        }

    }
}



