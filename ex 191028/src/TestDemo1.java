import java.lang.Math;
public class TestDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            int count = 0;
            int tmp = i;
            int sum = 0;
            //求位数
            while(tmp != 0){
                count++;
                tmp /= 10;
            }
            tmp = i;
            //就每位的count次方的和
            while (tmp != 0){
                sum += Math.pow((tmp%10),count);
                tmp /= 10;
            }
            //sum=i？打印：下一趟
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
