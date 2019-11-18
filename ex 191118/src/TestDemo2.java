abstract class Shap2{
    //abstract:抽像方法
    public abstract void draw();//没有具体实现的方法
}
class Rect2 extends Shap2{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}class Cycle2 extends Shap2{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
class Triangle2 extends Shap2{
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}
public class TestDemo2 {
    public static void drawMap(Shap2 shap2){
        shap2.draw();
    }
    public static void main(String[] args) {
        Shap2 shap2 = new Triangle2();
        drawMap(shap2);
    }
}
