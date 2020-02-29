import java.util.ArrayList;

/*class Book{}
class Person{
    public void print(){
        System.out.println("def");
    }
}
class MyArrayList{
    public MyArrayList(int capacity){
        array = new Object[capacity]; //就近原则，使用参数传进来的capacity
        size = 0;
        this.capacity = capacity;
    }
    public void add(Object e){
        //检测容量
        array[size++] = e;
    }
    public int size(){
        return size;
    }
    Object get(int index){
        //检测索引越界
        return array[index];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    Object[] array;
    int capacity;//总大小
    int size;//有效元素个数
}
public class Test5 {
    public static void main(String[] args) {
        MyArrayList L1 = new MyArrayList(10);
        L1.add(new Person());
        L1.add(new Person());
        L1.add(new Person());
        //向下转型：不安全
        Person p = (Person)L1.get(0);
        p.print();
        MyArrayList L2 = new MyArrayList(10);
        L2.add(new Book());
        L2.add(new Book());
        L2.add(new Book());

    }
}*/
/*class Book{}
class Person{
    public void print(){
        System.out.println("def");
    }
}
//这里给成泛型类
class MyArrayList<E>{
    public MyArrayList(int capacity){
        array = (E[])new Object[capacity];//构造时还不知道E是什么类型，故无法直接new E[] 类型空间，只能先申请Object[]然后进行 E[]的强转
        size = 0;
        this.capacity = capacity;
    }
    public void add(E e){
        //检测容量
        array[size++] = e;
    }
    public int size(){
        return size;
    }
    E get(int index){
        //检测索引越界
        return array[index];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    E[] array;
    int capacity;
    int size;
}
public class Test5 {
    public static void main(String[] args) {
        MyArrayList<Person> L1 = new MyArrayList(10);
        L1.add(new Person());
        L1.add(new Person());
        L1.add(new Person());
        Person p = L1.get(0);//
        p.print();
        MyArrayList<Book> L2 = new MyArrayList(10);
        L2.add(new Book());
        L2.add(new Book());
        L2.add(new Book());
        Book b = L2.get(2);
    }
}*/
/*public class Test5{
    public static void main(String[] args) {
//        ArrayList<Integer> L = new ArrayList<>();
//        L.add(10);
        int i = 10;
        Integer i1 = i;//编译器在编译阶段将i变成对应的包装类型
        Integer i2 = Integer.valueOf(i);//装箱
        int i3 = i2.intValue();//拆箱
    }
}*/
public class Test5{
    public static void main(String[] args) {
        Integer i = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        Integer i5 = Integer.valueOf(100);
        System.out.println(i == i2);
        System.out.println(i3 == i4);
    }
}
