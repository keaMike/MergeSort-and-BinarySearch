import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int midpoint = arr.length / 2;


        int[] left = new int[midpoint];
        int[] right;

        if (arr.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }

        // Populate left and right arrays
        for (int i = 0; i < midpoint; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[midpoint + j];
        }

        // Result with store the sorted array
        int[] result;

        System.out.println("Recursive call...\n" + "Left:" + Arrays.toString(left) + "\nRight" + Arrays.toString(right));
        // Recursive call to the mergeSort algorithm on both left and right array
        left = mergeSort(left);
        right = mergeSort(right);

        System.out.println("Merging...\nLeft:" + Arrays.toString(left) + "\nRight:" + Arrays.toString(right));

        result = merge(left, right);

        System.out.println("Result:" + Arrays.toString(result) + "\n");

        return result;
    }

    private int[] merge (int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        // While there's elements in either left or right array
        while (leftPointer < left.length || rightPointer < right.length) {

            // If both arrays contains elements
            if (leftPointer < left.length && rightPointer < right.length) {

                // If left number is lower than right number
                if (left[leftPointer] < right[rightPointer]) {

                    // Merge left number to result array
                    result[resultPointer++] = left[leftPointer++];
                } else {

                    // Merge right number to result array
                    result[resultPointer++] = right[rightPointer++];

                }
                // If there's only elements in left array
            } else if (leftPointer < left.length) {

                // Merge left number to result array
                result[resultPointer++] = left[leftPointer++];

                // If there's only elements in right array
            } else if (rightPointer < right.length) {

                // Merge right number to result array
                result[resultPointer++] = right[rightPointer++];

            }
        }

        return result;

    }
}
