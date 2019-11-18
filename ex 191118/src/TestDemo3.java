class Rect3 implements IShap{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}
class Cycle3 implements IShap{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}
public class TestDemo3 {
    public static void drawMap(IShap shap){
        shap.draw();
    }
    public static void main(String[] args) {
        IShap iShap = new Cycle3();
        IShap iShap1 = new Rect3();
        drawMap(iShap);
        drawMap(iShap1);
    }
}
