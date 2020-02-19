public class Test {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(Test.canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        int k = 0;
        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            for (; j <ch2.length ; j++) {
                if(ch2[j]==ch[i]){
                    k+=1;
                    continue;
                }else {
                    break;
                }
            }
        }
        if(k == ch.length){
            return true;
        }else {
            return false;
        }
    }
}
