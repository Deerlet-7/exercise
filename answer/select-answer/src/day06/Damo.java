package day06;

/**
 * Created by Deerlet-7 on 2020/4/9 14:43
 */
public class Damo{
    public static void main(String args[]){
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b){
        try
        {
            b += 10;
            return b;
        }
        catch(RuntimeException e)
        {
        }
        catch(Exception e2)
        {
        }
        finally
        {
            b += 10;
            return b;
        }
    }
}