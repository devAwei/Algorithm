/**
 * @Description: 斐波拉契数列
 * @Author: Awei
 * @Create: 2021-04-29 13:05
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(f(i)+"  ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(fun(i)+"  ");
        }
    }

    /**
     * 基于递归方式实现斐波拉契数列
     * @param n
     * @return
     */
    public static int f(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }

    /**
     * 非递归的形式
     * @param n
     * @return
     */
    public static int fun(int n) {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        int a = 1, b = 1;
        int f=0;
        for (int i = 3; i <= n; i++) {
            f = a + b;
//            b = f;
            a = b;
            b = f;
        }
        return f;
    }
}