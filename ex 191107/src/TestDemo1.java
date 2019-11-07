import java.util.Scanner;

public class TestDemo1 {
    public static int fun1(int a,int b,int c){
        int i = 1;
        for (; i < 10000; i++) {
            int n = i%3;
            int m = i/3;
            if(n == 0 && m%a == 0 && m%b == 0 && m%c == 0){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("需要核桃"+TestDemo1.fun1(a,b,c)+"个");
    }
}
