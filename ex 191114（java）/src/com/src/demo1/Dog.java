package com.src.demo1;

public class Dog extends Animal{
    private String sex;
    public Dog(String name,int age,String sex){
        super(name,age);//必须放在第一行
        this.sex = sex;
    }
    public void dark(){
        System.out.println(this.getName()+"wangwang");
    }
}
