import java.util.Arrays;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-22 14:00
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 5, 7, 8, 9, 10};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        // build heap,from the lasted leaf node
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            downAdjust(arr, i, arr.length);
        }
        // move head ele to tail ,downAdjust heap
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, 0);
            downAdjust(arr, 0, i);
        }
    }

    private static void downAdjust(int[] arr, int parentIndex, int len) {
        int childIndex = parentIndex * 2 + 1;
        int temp = arr[parentIndex];
        while (childIndex < len) {
            if(childIndex + 1 < len && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }



}
