package com.src.demo1;

public class Cat extends Animal{//Cat继承Animal
    //private String name;  //从父类继承，可省略
    //private int age;
    private String sex;
    public Cat(String name,int age,String sex){
        super(name,age);//必须放在第一行
        //this.name = name;//从父类继承不用再写
        //this.age = age;
        this.sex = sex;//sex为Cat特有的，无法省略
    }
    /*public void eat(){
        System.out.println(this.getName()+"eat()");    //从Animal继承
    }*/
}
