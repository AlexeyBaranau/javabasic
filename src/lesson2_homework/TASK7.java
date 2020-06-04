/*Task 7.  Write a Java program to remove a specific element from an array.*/

package lesson2_homework;


import java.util.Arrays;

public class TASK7 {
    public static void main(String[] args) {
        Integer arr[] = {15, 153, 3, 47, 66, 56, 574, 32, 45};
        Homework2Util.arrayToPrint(arr);
        System.out.println(Arrays.toString(removeElement(arr, 47)));
        }
        public static Integer[] removeElement (Integer[] nums, int val) {
            int offset = 0;
            for(int i = 0; i< nums.length; i++){
                if(nums[i] == val){
                    offset++;
                } else{
                    nums[i - offset] = nums[i];
                }
            }
            return Arrays.copyOf(nums, nums.length - offset);
        }
    }