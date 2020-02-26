import java.util.Scanner;

public class Test2 {
    //回文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 12345432;
        System.out.println(Test2.isPalindrome(num));
    }
    public static boolean isPalindrome(int x) {
        //笨死啦笨死啦呜呜呜T_T
        int a = x;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int t = 0;
        while (x > 0) {
            t = t * 10 + x % 10;
            x /= 10;
        }
        return t == a;
       /* if(x<0){
            return false;
        }
        int count = 0;
        int ex = 0;
        int x2 = x;
        int last = 0;
        int ex2=0;
        while (x2!=0){
            count++;
            x2 /= 10;
        }
        int count2 = count/2;
        int count3 = count2;
        if(count%2 != 0){
            count3=count2+1;
        }
        ex = (int) (x/(Math.pow((double)10,(double)count3)));
        last = (int) (x%(Math.pow((double)10,(double)(count/2))));
        for (int i = 0; i < count/2 ; i++) {
            ex2 += ((ex%10)*(Math.pow((double)10,(double)--count2)));
            ex/=10;
        }
        if(ex2==last){
            return true;
        }else {
            return false;
        }*/
    }
}
