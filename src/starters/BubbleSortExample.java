package starters;

import bubble_sort.BubbleSort;

import java.util.Arrays;

public class BubbleSortExample {

    public static void bubbleSortStarter() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numsNull = null;
        int[] sortedArray = {1,2,3,4,5,6};
        int[] array = {10,9,8,1,2,3,4,5};
        int[] emptyArray = {};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort.sortArray(array)));

    }

}
