class Calculator {
    private double num1;
    private double num2;
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public double add() {
        return this.num1+this.num2;
    }
    public double sub() {
        return this.num1-this.num2;
    }
    public double mul() {
        return this.num1*this.num2;
    }
    public double div() {
        return this.num1/this.num2;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Calculator caculator = new Calculator();
        caculator.setNum1(10);
        caculator.setNum2(8);
        System.out.println(caculator.add());
    }
}
