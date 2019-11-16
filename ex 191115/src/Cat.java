public class Cat extends Animal{//Cat继承Animal
    private String sex;
    public Cat(String name,int age,String sex){
        super(name,age);//必须放在第一行
        this.sex = sex;//sex为Cat特有的，无法省略
    }
    public void jump(){
        System.out.println(this.getName()+"jump");
    }
    public void eat(){
        System.out.println("cat::eat()");
    }
}
