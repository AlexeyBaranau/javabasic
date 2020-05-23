/*Напишите программу, где двум строковым переменным присваиваются значения,
 третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
 Затем напечатайте значение третьей строковой переменной.*/

package lesson1_homework;


public class TASK13 {
    public static void main(String[] args) {
    String a = "Я изучаю";
    String b = " Java";
    String c = a.concat(b);
        System.out.println(c);
    }
}



