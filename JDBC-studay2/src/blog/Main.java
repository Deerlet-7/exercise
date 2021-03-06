package blog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Deerlet-7 on 2020/7/17 17:00
 * 命令行版本的博客系统
 */
public class Main {
    private static List<String> featureList = new ArrayList<>();
    private static List<Action> actionList = new ArrayList<>();
    private static void initFeatureList(){
        featureList.add("用户注册");
        featureList.add("用户登录");
        featureList.add("查看文章列表-按照发表时间倒叙给出");
        featureList.add("查看文章-要求先登录");
        featureList.add("查看指定文章内容");
        featureList.add("评论指定文章-要求先登录");
        featureList.add("点赞指定文章-要求先登录");
    }
    private static void initActionList(){
        actionList.add(new UserRegisterAction());
        actionList.add(new UserLoginAction());
        actionList.add(new ArticleListAction());
        actionList.add(new ArticlePublishAction());
        actionList.add(new ArticleDetailAction());
    }
    public static void main(String[] args) {
        initFeatureList();
        initActionList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            showMenu();
            showPrompt();
            int select = scanner.nextInt();
            //分发
            doAcyion(select);
        }
    }
    private static void doAcyion(int select) {
        if(select == 0){
            System.out.println("欢迎下次再来！");
            System.exit(0);
        }
        System.out.println("您选择的是："+featureList.get(select-1));
        if(select-1<actionList.size()){
            Action action = actionList.get(select-1);
            action.run();
        }else {
            System.out.println("该功能尚未支持，敬请期待...");
        }
    }
    private static void showPrompt() {
        System.out.println("请选择功能序号>");
    }
    private static void showMenu() {
        System.out.println("欢迎使用《博客系统》，支持以下功能");
        for (int i = 0; i < featureList.size(); i++) {
            System.out.printf("  %d. %s%n",i+1,featureList.get(i));
        }
        System.out.println("  0. 退出");
    }
}
