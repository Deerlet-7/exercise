    class Person{
        //属性   成员变量  实例成员变量
        public String name;
        public int age;
        //static 修饰的叫静态成员变量  在方法区
        public static int count = 10;
        public static final int SIZE = 30;
        public  final int SIZE2 = 20;//实例成员变量  常量  属于对象 存在堆里
        public static void fun1(){
            System.out.println("lalal");
        }
        //行为    方法    成员方法   实例成员方法
        public void eat(){//行为最好是名词
            System.out.println("吃饭");
        }
        public void sleep(){
            System.out.println("睡觉");
        }
        public void show(){
            System.out.println("name"+name+"age"+age);
        }
    }
    public class TestDemo {
        public static void main5(String[] args) {
            Person person = new Person();
            System.out.println(person.count);
        }

        public  void main(String[] args) {
            TestDemo testDemo = new TestDemo();
            testDemo.main(lalala);
        }
        public static void main1(String[] args) {
            //实例化一个对象
            Person person = new Person();
            person.name = "张飞";
            person.age = 18;
            person.show();
            person.eat();
            Person person2 = new Person();
            person2.name = "李白";
            person2.age = 99;
            person2.eat();
            person2.show();
        }
}
