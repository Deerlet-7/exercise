public class TestDemo1 {
    public static void main(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        System.out.println(str == str2);
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

    }
}
