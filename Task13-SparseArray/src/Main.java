/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-06-10 17:40
 **/
public class Main {
    public static void main(String[] args) {
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        int sum = 0;
        //遍历原棋盘数组
        for (int[] num : chessArr) {
            for (int data : num) {
                System.out.printf("%d\t", data);
                if (data != 0) {
                    sum++;
                }
            }
            System.out.println();
        }

        // 创建 稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int row = 1;
        for (int i = 1; i < chessArr.length; i++)
            for (int j = 0; j < chessArr[i].length; j++)
                if (chessArr[i][j] != 0) {
                    sparseArr[row][0] = i;
                    sparseArr[row][1] = j;
                    sparseArr[row][2] = chessArr[i][j];
                    row++;
                }


        //遍历稀疏数组
        System.out.println("遍历稀疏数组");
        for (int[] num : sparseArr) {
            for (int data : num) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
