package day03;

/**
 * Created by Deerlet-7 on 2020/4/4 14:18
 */
public class Person{
    protected String name = "Person";
    int age=0;
}
class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.name);
    }
}
