public class TestDemo1 {
    public static void main1(String[] args) {
        Animal animal= new Bird("niao ",3,"black");
        animal.eat();
//        Bird bird = (Bird)animal;//animale无法直接调用fly(),只能将其强转为Bird类型来调用fly()方法
//        bird.fly();
        Cat cat = (Cat)animal;
        cat.jump();
    }
}
