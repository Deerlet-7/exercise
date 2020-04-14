package day08;

/**
 * Created by Deerlet-7 on 2020/4/14 15:27
 */
public class Main{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
}

