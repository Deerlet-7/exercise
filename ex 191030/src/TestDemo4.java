class MyNum{
    private int num;
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}
public class TestDemo4 {
    public static void swap(MyNum Num,MyNum Num2){
        MyNum tmp =Num2;
        Num2 = Num;
        Num = tmp;
    }
    public static void main(String[] args) {
        MyNum myNum = new MyNum();
        myNum.setNum(10);
        MyNum myNum2 = new MyNum();
        myNum2.setNum(20);
        System.out.println(myNum+""+myNum2);
        swap(myNum.getNum(),myNum.getNum());
        System.out.println(myNum+""+myNum2);
    }
}
