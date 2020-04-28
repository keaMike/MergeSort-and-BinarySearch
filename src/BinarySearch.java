public class BinarySearch {
    public int binarySearch(int[] arr, int num) {
        return binarySearchRecursive(arr, num, 0, arr.length - 1);
    }

    public int binarySearchRecursive(int[] arr, int num, int low, int high) {
        if (low > high) {
            return - 1;
        }

        int mid = (high + low) / 2;
        if (arr[mid] == num) {
            return arr[mid];
        } else if (arr[mid] > num) {
            return binarySearchRecursive(arr, num, low, mid - 1);
        } else {
            return binarySearchRecursive(arr, num, mid + 1, high);
        }
    }
}
