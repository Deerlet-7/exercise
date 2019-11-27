public class TestDemo1 {
    public static void main(String[] args) {
        String str = "342jfs342";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(48>ch[i]||ch[i]>58){
                System.out.println("有字符！！！");
                return;
            }
        }
        System.out.println("是数字");
    }
}
