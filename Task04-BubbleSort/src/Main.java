import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Author: Awei
 * @Create: 2021-04-19 19:35
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = arr.length; i > 0; i--) {
            arr[arr.length - i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] newArr = bubbleSort(arr);
        System.out.println(Arrays.toString(newArr));
        cockTailSort(arr);
    }

    private static int[] bubbleSort(int[] arr) {
        int sortBorder = arr.length - 1;
        int lastExchangeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    lastExchangeIndex = j;
                    isSorted = false;
                }

            }
            sortBorder = lastExchangeIndex;
            if(isSorted) break;
        }
        return arr;
    }

    private static void cockTailSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                if(isSorted) break;
            }

            isSorted = true;
            for (int j = arr.length - i - 1; j > i; j--) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
                if(isSorted) break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
