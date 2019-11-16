public class TestDemo1 {
    public static void func(Animal animal){
        animal.eat();
    }
    public static Animal func2(){
        Cat cat = new Cat("mimi",3,"man");
        return cat;
    }
    public static void main(String[] args) {
        Animal animal = func2();
//        Cat cat = new Cat("mimi",2,"man");
//        func(cat);
    }
}
