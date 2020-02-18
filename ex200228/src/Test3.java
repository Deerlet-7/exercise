public class Test3 {
    public static void main(String[] args) {
        int i = 2;
        int result = 0;
        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        System.out.println(result);
    }
}
