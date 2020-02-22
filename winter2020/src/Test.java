public class Test {
	//
    public static void main(String[] args) {
        String ransomNote = "bg";
        String magazine = "efjbdfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(Test.canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        int k = 0;

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j <ch2.length ;j++ ) {
                if(ch2[j]==ch[i]){
                    k+=1;
                    i++;
                    continue;
                }else {
                    k=0;
                    continue;
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
