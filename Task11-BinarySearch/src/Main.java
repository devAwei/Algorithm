import java.util.Arrays;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-29 16:15
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 1; i <= 10; i++) {
            nums[i-1] = i + (i + 1) * i;
        }
        System.out.println(Arrays.toString(nums));
        for (int i : nums) {
            System.out.print(binarySearch(nums, i)+"  ");
        }
        System.out.println(binarySearch(nums, 1000));
    }


    private static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]==target)
                return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            }else
                right = mid - 1;
        }
        return -1;
    }
}
