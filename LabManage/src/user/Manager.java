package user;
import operation.*;
import java.util.Scanner;

public class Manager extends User{
    public Manager(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new AddOperation(),
                new DeleteOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello "+this.name+"欢迎来到实验室预约系统");
        System.out.println("0.添加实验室");
        System.out.println("1.删除实验室");
        System.out.println("2.显示所有实验室");
        System.out.println("3.退出系统");
        System.out.println("=============================");
        System.out.println("请输入你的选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
