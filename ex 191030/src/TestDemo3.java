class MyClass{
    private double num1;
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }
    public double big(){
        return this.num1*num1;
    }
    public double small(){
        return this.num1/num1;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setNum1(4);
        System.out.println(myClass.big());
        System.out.println(myClass.small());

    }
}
