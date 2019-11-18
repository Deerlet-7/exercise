public class Bird extends Animal{
    public String feather;

    public Bird(String name, int age, String feather) {
        super(name, age);
        this.feather = feather;
    }

    public void fly(){
        System.out.println("fly()");
    }
}
