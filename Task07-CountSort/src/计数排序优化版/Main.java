package 计数排序优化版;

import java.util.Arrays;

/**
 * @Description:   name         score
 *                 xiaohui       90
 *                 xiaohuang     99
 *                 xiaohong      95
 *                 xiaobai       94
 *                 xiaolv        95
 * 给出一个学生成绩表，要求按成绩从低到高进行排序，如果成绩相同，则遵循原表固有的顺序。
 * @Author: Awei
 * @Create: 2021-04-26 15:58
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {90,99,95,94,95};
        int[] arrResult = countSort(arr);
        System.out.println(Arrays.toString(arrResult));
    }

    private static int[] countSort(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        return null;
    }
}
