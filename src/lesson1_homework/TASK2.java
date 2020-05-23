/*Напишите метод, который будет увеличивать каждый элемент массива на 10%.*/


package lesson1_homework;


public class TASK2 {
    public void increaseelementsby10percent(double[] mas) {
        if (mas != null) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] += mas[i] * 0.1;
            }
        }
    }
}

