public class Test {
	//赎金信 一开始题目理解有问题
    public static void main(String[] args) {
        String ransomNote = "bbg";
        String magazine = "efjdfjagddfgdiaigdadhcfcbj";
        System.out.println(Test.canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        /*if (magazine.length() < ransomNote.length()) return false;
        int caps[] = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1)
                return false;
            caps[c - 97] = index + 1;
        }
        return true;*/
        StringBuilder stringBuilder = new StringBuilder(magazine);
        int index;
        for (char c : ransomNote.toCharArray()) {
            index = stringBuilder.indexOf(String.valueOf(c));
            if (index >= 0) {
                stringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;

         //问题代码
       /* char[] ch = ransomNote.toCharArray();
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
        }*/
    }
}
