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
        int d = max - min;
        int[] countArr = new int[d + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i] - min]++;
        }
        //统计数组变形 加上之前的总和
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }
        // arr数组：  90 99 95 94 95
        // count原型： 1 0 0 0 1 2 0 0 0 1 长度为10
        // count变形： 1 1 1 1 2 4 4 4 4 5
        int[] sortedArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            //从arr 待排序数组的最后一个元素开始遍历，arr[i]-min 为统计数组的索引位置，
            // 在countArr中，下标为 arr[i]-min 表示arr[i] 在 sortedArr中的位置，为第countArr[arr[i]-min]个
            // 在sortedArr中，第 countArr[arr[i]-min]个元素的索引值为： countArr[arr[i]-min]-1
            //  故 sortedArr[countArr[arr[i]-min]-1] =arr[i]
            sortedArr[countArr[arr[i] - min] - 1] = arr[i];
            // 使 下次在遍历到该元素时，他的序号-1
            countArr[arr[i] - min]--;
        }
        return sortedArr;
    }
}

/**
 * 计数排序： 代码最开始都涉及到遍历原始数列，运算量都是n ，第三部遍历统计数列，运算量是m；时间复杂度为 O（n+m）
 *          不考虑结果数组，只考虑统计数组大小，空间复杂度是 O(m)
 * 计数排序局限性：
 *      1. 当 d=max - min 过大时，并不适合用计数排序，造成空间的浪费。
 *      2. 计数排序不适合用于小数
 *
 */
