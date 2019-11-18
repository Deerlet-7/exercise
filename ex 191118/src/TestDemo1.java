class Shap{
    public void drow(){

    }
}
class Rect extends Shap{
    @Override
    public void drow() {
        //super.drow();
        System.out.println("♦");
    }
}class Cycle extends Shap{
    @Override
    public void drow() {
        System.out.println("⚪");
    }
}
class Triangle extends Shap{
    @Override
    public void drow() {
        System.out.println("🔺");
    }
}
public class TestDemo1 {
    public static void drawMap(Shap shap){
        shap.drow();
    }
    public static void main(String[] args) {
        Shap shap1 = new Rect();
        Shap shap2 = new Cycle();
        Shap shap3 = new Triangle();
        drawMap(shap1);
        drawMap(shap2);
        drawMap(shap3);
    }
}
