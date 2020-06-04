/*
Напишите метод переводящий рубли в доллары по заданному курсу.
 В качестве аргументов укажите кол-во рублей и курс.
*/

package lesson1_homework;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TASK18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько рублей вы хотите поменять");
        double rubles = sc.nextDouble();
        System.out.println("Введите курс доллара");
        double rate = sc.nextDouble();
        System.out.println("Вы получите " + exchangeRates(rubles, rate) + "долларов");
        }

        protected static double exchangeRates(double rubles, double rate) {
            double dollars = rubles / rate;
            dollars = new BigDecimal(dollars).setScale(2, RoundingMode.HALF_UP).doubleValue();
            return dollars;
        }

    }



