package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] numbers) {

        boolean isSorted = false;

        for (int i = 0; i < numbers.length && !isSorted; i++) {
            isSorted = true;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }



    public static void main(String[] args) {
//        int[] numsNull = null;
        int[] nums = {1,2,3,4,5,6};
//        int[] nums = {10,9,8,1,2,3,4,5};
//        int[] empty = {};
        System.out.println("Unsorted array: " + Arrays.toString(nums));
        sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

    }
}