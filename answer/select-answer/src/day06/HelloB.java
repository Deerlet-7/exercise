package day06;

/**
 * Created by Deerlet-7 on 2020/4/9 14:36
 */
class HelloA{
    public HelloA()
    {
        System.out.println("I’m A class ");
    }
    static
    {
        System.out.println("static A");
    }
}
public class HelloB extends HelloA{
    public HelloB()
    {
        System.out.println("I’m B class");
    }
    static{
        System.out.println("static B");
    }
    public static void main (String[] args){
        new HelloB();
    }
}

