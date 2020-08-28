package jmm;

class Child extends Parent {
    static {
        A = 400;
    }
    public static int A = 300;
    {
        System.out.println("child实例代码块："+c);
    }
    static {
        System.out.println("child静态代码块：A="+A);
    }
    public Child(int c) {
        super(c, "Child");
        System.out.println("child构造方法");
    }
    @Override
    public void print() {
        System.out.println("Child print, c="+c+", name="+name);
    }
}