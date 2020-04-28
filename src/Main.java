import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort mS = new MergeSort();
        BinarySearch bS = new BinarySearch();

        int[] binaryArray = {1, 5, 12, 31, 45, 56};

        int[] mergeArray = {56, 5, 12, 1, 31, 9, 3, 50};

        //System.out.println( bS.binarySearch(binaryArray, 5));

        System.out.println("Initial array: \n" + Arrays.toString(mergeArray));
        System.out.println("Sorted array with merge sort");
        System.out.println(Arrays.toString(mS.mergeSort(mergeArray)));

    }
}
