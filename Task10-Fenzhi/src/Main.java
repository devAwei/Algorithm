/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-04-29 13:36
 **/
public class Main {
    public static void main(String[] args) {

        System.out.println(fun(777, 1));

    }

    /**
     * 分治 求 a 的n 次方
     * @param n
     * @return
     */
    public static int fun(int a,int n) {
        if(n==0) return 1;
        if(n==1) return a;
        return n % 2 == 0 ?
                fun(a, n / 2) * fun(a, n / 2) :
                fun(a, (n - 1) / 2) * fun(a, (n - 1) / 2 + 1);
    }
}
