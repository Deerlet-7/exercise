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
class Book{}
class Person{
    public void print(){
        System.out.println("def");
    }
}
//这里给成泛型类
class MyArrayList<E>{
    public MyArrayList(int capacity){
        array = new Object[capacity];
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
    E get(int index){
        //检测索引越界
        return array[index];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    Object[] array;
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
        MyArrayList L2 = new MyArrayList(10);
        L2.add(new Book());
        L2.add(new Book());
        L2.add(new Book());

    }
}
