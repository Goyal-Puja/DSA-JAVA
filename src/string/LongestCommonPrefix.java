package string;

public class LongestCommonPrefix {
    public static String commonPrefix(String s1, String s2){
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                break;
            } else {
                i++;
                j++;
            }
        }
        return s1.substring(0,i);
    }
    public String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            prefix = commonPrefix(prefix,strs[i]);
        }
        return prefix;
    }
    public static void main(String[] args){
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}
