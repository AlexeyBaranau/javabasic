/*Все элементы массива поделить на значение наибольшего элемента этого массива*/

package lesson1_homework;


public class TASK17 {
    public static void main(String[] args) {
      double mas [] =  {55, -9, 12, 43, 87, -99, 4, 16, -35, 3};
      double max;
      int a;
      max = mas [0];
      for (int i = 1; i < mas.length; i++) {
          if (mas[i] > max) max = mas [i];
      }
      for (double element : mas) {
          element = element / max;
          System.out.println(element);
      }
    }
}



