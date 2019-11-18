class Person implements Cloneable{
    public String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        person.name = "caocao";
        System.out.println(person.name);
        System.out.println("clone");
        Person person1 = (Person) person.clone();
        person1.name = "liubei";
        System.out.println(person.name);
        System.out.println(person1.name);
    }
}
