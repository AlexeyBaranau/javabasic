/*Напишите метод, который будет проверять является ли число
        палиндромом (одинаково читающееся в обоих направлениях).*/

package lesson1_homework;


import java.util.Scanner;

;

public class TASK3 {
    public static void main(String[] args) {
        String inputString, reversedString = "";
        Scanner sc = new Scanner(System.in);
        int stringLength;
        System.out.println("Введите число или строку");
        inputString = sc.nextLine();
        stringLength = inputString.length();
        for (int x = stringLength - 1; x>=0; x--) {
            reversedString = reversedString + inputString.charAt(x);
        }
        if(inputString.equals(reversedString)) {
            System.out.println("Введенное значение является палиндромом");
        }
        else{
            System.out.println("Введенное значение не является палиндромом");
        }
    }
    }
