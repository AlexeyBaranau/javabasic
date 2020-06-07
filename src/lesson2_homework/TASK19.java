/*Task 19. Write a Java program to add two matrices of the same size.*/

package lesson2_homework;

import static lesson2_homework.Homework2Util.*;

public class TASK19 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {20, 19, 18, 17},
                {20, 19, 18, 17},
                {12, 11, 10, 9},
        };
        int[][] matrix2 = {
                {12, 11, 10, 9},
                {20, 19, 18, 17},
                {20, 19, 18, 17},
        };

        System.out.println("Первая матрица:");
        printMatrix(matrix1);
        System.out.println();
        System.out.println("Вторая матрица:");
        printMatrix(matrix2);
        System.out.println();
        System.out.println("Матрица после суммирования:");
        sumTwoMatrixes(matrix1, matrix2);
    }
}