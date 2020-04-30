package day28;

import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/30 14:55
 * 密码验证合格程序
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String password1 = sc.nextLine();
            char[] password = password1.toCharArray();
            if(judge(password)){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }
    public static boolean judge(char[] password){
        if(password.length <= 8){
            return false;
        }
        int num = 0, uppercase = 0,lowercase = 0, others = 0;
        for (int i = 0; i < password.length; i++) {
            char k = password[i];
            if(k >= '0' && k <= '9'){
                num = 1;
                continue;
            }else if(k >= 'a' && k <= 'z'){
                lowercase = 1;
                continue;
            }else if(k >= 'A' && k <= 'Z'){
                uppercase = 1;
                continue;
            }else {
                others = 1;
                continue;
            }
        }
        int sum = num + lowercase + uppercase + others;
        if(sum < 3){
            return false;
        }else {
            String psw = new String(password);
            //判断有没有长度超过2的子串重复
            for (int i = 0; i < password.length-2; i++) {
                String key = psw.substring(i,i+3);
                if(psw.substring(i +1).contains(key)){
                    return false;
                }
            }
        }
        return true;
    }
}
