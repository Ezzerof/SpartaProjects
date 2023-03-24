package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] numbers) {

        if (numbers == null)
            return new int[]{0};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }



    public static void main(String[] args) {
//        int[] numsNull = null;
        int[] nums = {-2,-3,-89,0,1,-21};
//        int[] numsNeg = {10,9,8,1,2,3,4,5};
//        int[] empty = {};
        System.out.println("Unsorted array: " + Arrays.toString(nums));

        int[] res = sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(res));

    }
}