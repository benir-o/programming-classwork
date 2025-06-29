import java.lang.reflect.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { -2, 3, 4, 7, 8, 9, 11, 13 };
        int target = 11;
        BinarySearch searchItem1 = new BinarySearch();
        int thing = searchItem1.search(array, target);
        // System.out.println(BinarySearch.rotate(array));

    }

    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (int) Math.floor((start + end) / 2);
            if (arr[mid] == target) {
                System.out.println("Found " + arr[mid]);
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Rotating an array by a factor of 1.
    public static int rotate(int[] array) {
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
        return array[array.length - 1];
    }
}
