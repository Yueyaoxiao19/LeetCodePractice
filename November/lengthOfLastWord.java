public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if(s == null || s.isEmpty() ){
            return 0;
        }
        String t = s.trim();
        int j = 0;
        for(int i = t.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                return j;
            }
            j++;
        }
        return j;
    }
    public static void main (String[] agrs){
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("Hello World  "));
        System.out.println(lengthOfLastWord("Hello Worl d"));
    }
}
