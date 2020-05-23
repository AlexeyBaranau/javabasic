/*
Напишите метод переводящий рубли в доллары по заданному курсу.
 В качестве аргументов укажите кол-во рублей и курс.
*/

package lesson1_homework;


import java.util.Scanner;

public class TASK18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько рублей вы хотите поменять");
        double rubli = sc.nextDouble();
        System.out.println("Введите курс доллара");
        double kurs = sc.nextDouble();
        System.out.println("Вы получите " + convert(rubli, kurs) + "долларов");
        }
        static double convert (double rubli, double kurs) {
        return rubli / kurs;
        }

    }



