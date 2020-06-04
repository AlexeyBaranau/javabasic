/*Task 20. Write a Java program to convert an array to ArrayList.*/

package lesson2_homework;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TASK20 {
    public static void main(String[] args) {
        int [] arr = {12, 35, 47, 5, 6, 154, 23};
        List<Integer> nums =Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(nums);
    }
    }