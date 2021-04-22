/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-11 15:05
 **/
public class Main {
    static int m = 0;
    public static void move(int disks, char N, char M) {
        System.out.println("第" + (++m) + "次移动：" + "把" + disks + "号圆盘从" + N + "-》移动到-》" + M);
    }

    /**
     * 递归函数
     * @param disks
     * @param A
     * @param B
     * @param C
     */
    public static void hanoi(int disks, char A, char B, char C) {
        if (disks == 1) {
            move(1, A, C);
        }else {
            hanoi(disks -1, A, C, B);
            move(disks,A,C);
            hanoi(disks-1 , B, A, C);
        }
       /* if (disks == 0) {
            return;
        }else {
            hanoi(disks-1, A, C, B);
            move(disks, A, C);
            hanoi(disks - 1, B, A, C);
        }*/


    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
