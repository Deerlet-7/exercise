import lab.LabList;
import user.Manager;
import user.Teacher;
import user.User;
import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入你的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("输入你的身份（1老师   2管理员）：");
        int who = scanner.nextInt();
        if(who == 1){
            return new Teacher(name);
        }else {
            return new Manager(name);
        }
    }

    public static void main(String[] args) {
        LabList labList = new LabList();
        User user = login();
        while (true){
            int choice = user.menu();
            user.doOperation(choice,labList);
        }
    }
}
