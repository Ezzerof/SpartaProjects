package bubble_sort;

public class BubbleSort {
    public int[] sortArray(int[] numbers) {

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

        return numbers;
    }

}