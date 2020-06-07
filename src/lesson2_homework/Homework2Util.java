package lesson2_homework;

import java.util.Arrays;

public class Homework2Util {

    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] randomArray() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static Integer[] removeElement(Integer[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int value = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = value;
        }
        return array;
    }

    public static void findRepeatingIntElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Repeating elements: " + array[i]);
                }
            }
        }
    }

    public static void findRepeatingStringElements(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    System.out.println("Repeating elements: " + array[i]);
                }
            }
        }
    }

    public static void findRepeatingStringElements(String[] array, String[] array1) {
        for (String element : array) {
            for (String element1 : array1) {
                if (element.equalsIgnoreCase(element1)) {
                    System.out.println("Repeating elements: " + element);
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        int value;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    value = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = value;
                }
            }
        }
    }

    public static void deleteDuplicateElements(int[] array) {
        int n = array.length;
        for (int i = 0, k; i != n; i++, n = k) {
            for (int j = k = i + 1; j != n; j++) {
                if (array[j] != array[i]) {
                    if (k != j) array[k] = array[j];
                    k++;
                }
            }
        }

        if (n != array.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = array[i];
            array = b;
        }
        printArray(array);
    }

    public static void secondHighestElement(int[] array) {
        int high1 = array[0];
        int high2 = array[0];
        for (int value : array) {
            if (value > high1) {
                high2 = high1;
                high1 = value;
            } else if (value > high2) {
                high2 = value;
            }
        }
        System.out.println("Максимальный элемент массива: " + high1);
        System.out.println("Второй по величине элемент массива: " + high2);
    }

    public static void secondSmallestElement(int[] array) {
        int small1 = array[0];
        int small2 = array[0];
        for (int value : array) {
            if (value < small1) {
                small2 = small1;
                small1 = value;
            } else if (value < small2) {
                small2 = value;
            }
        }
        System.out.println("Минимальный элемент массива: " + small1);
        System.out.println("Второй наименьший элемент массива: " + small2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumTwoMatrixes (int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    printMatrix(matrix3);
    }
    }