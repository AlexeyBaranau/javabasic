/*Пройти циклом по числам от 1 до 12 и вывести название месяца,
 соответствующее каждому числу (используя цикл и оператор if else)*/

package lesson1_homework;


public class TASK8  {
    public static void main(String[] args) {
        for (int a = 1; a <= 12; a++) {
            switch (a) {
                case 1:
                    System.out.print("1 ");
                    System.out.println(Months.JANUARY);
                    break;
                case 2:
                    System.out.print("2 ");
                    System.out.println(Months.FEBRUARY);
                    break;
                case 3:
                    System.out.print("3 ");
                    System.out.println(Months.MARCH);
                    break;
                case 4:
                    System.out.print("4 ");
                    System.out.println(Months.APRIL);
                    break;
                case 5:
                    System.out.print("5 ");
                    System.out.println(Months.MAY);
                    break;
                case 6:
                    System.out.print("6 ");
                    System.out.println(Months.JUNE);
                    break;
                case 7:
                    System.out.print("7 ");
                    System.out.println(Months.JULY);
                    break;
                case 8:
                    System.out.print("8 ");
                    System.out.println(Months.AUGUST);
                    break;
                case 9:
                    System.out.print("9 ");
                    System.out.println(Months.SEPTEMBER);
                    break;
                case 10:
                    System.out.print("10 ");
                    System.out.println(Months.OCTOBER);
                    break;
                case 11:
                    System.out.print("11 ");
                    System.out.println(Months.NOVEMBER);
                    break;
                case 12:
                    System.out.print("12 ");
                    System.out.println(Months.DECEMBER);
                    break;
            }
        }
    }
}



