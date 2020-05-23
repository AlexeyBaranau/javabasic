/*Пройти циклом по числам от 1 до 12 и вывести название месяца,
 соответствующее каждому числу (используя цикл и оператор if else)*/

package lesson1_homework;


public class TASK8 {
    public static void main(String[] args) {
        for (int a = 1; a <= 12; a++) {
            switch (a) {
                case 1:
                    System.out.println(a + " Январь");
                    break;
                case 2:
                    System.out.println(a + " Февраль");
                    break;
                case 3:
                    System.out.println(a + " Март");
                    break;
                case 4:
                    System.out.println(a + " Апрель");
                    break;
                case 5:
                    System.out.println(a + " Май");
                    break;
                case 6:
                    System.out.println(a + " Июнь");
                    break;
                case 7:
                    System.out.println(a + " Июль");
                    break;
                case 8:
                    System.out.println(a + " Август");
                    break;
                case 9:
                    System.out.println(a + " Сентябрь");
                    break;
                case 10:
                    System.out.println(a + " Октябрь");
                    break;
                case 11:
                    System.out.println(a + " Ноябрь");
                    break;
                case 12:
                    System.out.println(a + " Декабрь");
                    break;
            }
        }
    }
}



