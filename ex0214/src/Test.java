public class Test {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String str) {
        int len = str.length();
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(ch>64&&ch<91){
                ch+=32;
            }
            chars[i]=ch;
        }
        String s2 = new String(chars);
        return s2;
    }
}
