public class TestDemo1 {
    public static void reverseString(char[] s) {
        int left = 0;
        int reight = s.length - 1;
        while (left<reight){
            char tmp = s[reight];
            s[reight] = s[left];
            s[left] = tmp;
            left++;
            reight--;
        }
        for (char x: s) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        String str = "abcdef";
        char[] s = str.toCharArray();
        System.out.println(str);
        reverseString(s);
    }
}
