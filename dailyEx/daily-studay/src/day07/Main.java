package day07;

/**
 * Created by Deerlet-7 on 2020/4/6 22:12
 * 不能二
 */
/*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W=0,H=0;
        while(sc.hasNext()){
            W = sc.nextInt();
            H = sc.nextInt();
        }
        System.out.println(withoutTow(W,H));
    }
    public static int withoutTow(int W,int H){
        if((W%4==0)&&(H%4 == 0)){
            return W*(H/2);
        }
    }
}*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n=sc.nextInt();
        int count1 = (n/4)*2+(n%4)<2?(n%4):2;
        int count2 = ((n-2)/4)*2+((n-2)%4)<2?((n-2)%4):2;
        int sum = (m/4)*2*(count1+count2);

//        sum += (m%4)<2?count1*(m%4):(2*count1)+count2*((m%4)%2);
        System.out.println(sum);
    }
}
