package jmm;

public class ClassLoadLook {

    public static void main(String[] args) throws ClassNotFoundException {
        Child2 c2 = new Child2(200, "child2");
        int x = InterfaceLoad.X;
        Class c3 = Child.class;
        //大家想想下边的打印顺序
        Class.forName("jmm.Child3");
        int a = Child.A;
//        new Child(200);
        //再次修改一下，把Child类定义在parent类外边，再看看运行结果
    }
}
