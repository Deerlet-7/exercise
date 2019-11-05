import java.util.Scanner;

public class TestDemo1 {
	   public static int fibonacci2(int n){
        int a = 1;
        int b = 1;
        int c = 1;//若n=1或2时直接retyrn1.
        for (int i = 3; i <= n; i++) {//i<=n,否则n=3时依然无法进入循环
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("输入要查看斐波那契数列的位数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(TestDemo1.fibonacci2(n));
    }
    public static void main(String[] args) {//判断闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要判断的年份");
        int year = sc.nextInt();
        if(year%4 == 0&&year%100!=0||year%400 == 0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
