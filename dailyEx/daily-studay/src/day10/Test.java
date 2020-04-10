package day10;

/**
 * Created by Deerlet-7 on 2020/4/10 14:22
 * 机器人走方格
 */
public class Test {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        System.out.println(countWays(a,b));
    }
    public static int countWays1(int x, int y) {
        // write code here
        int[][] dp = new int[x][y];
        dp[0][0] = 1;
        for(int i = 1; i < x; i++){
            dp[i][0] = dp[i-1][0];
        }
        for(int i = 1; i < y; i++){
            dp[0][i] = dp[0][i-1];
        }
        for(int i = 1; i < x; i++){
            for(int j = 1; j < y; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[x-1][y-1];
    }
    public static int countWays(int x, int y) {
        if(x == 1){
            return 1;
        }
        x -= 1;
        y -= 1;
        int sum = x + y;
        int a = sum;
        int cou = 1;
        int b = cou;

        while(x>1){
            sum *= --a;
            cou *= ++b;
            x--;
        }
        return (sum/cou);
    }
}
