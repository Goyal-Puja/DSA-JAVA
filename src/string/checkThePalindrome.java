package string;

public class checkThePalindrome {
    public static void main(String[] args){
       String str = "c1 O$d@eeD o1c";
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               sb.append(Character.toLowerCase(ch));
           }
       }
       int i =0;
       int j = sb.length()-1;
       boolean isPalindrome = true;
       while(i < j){
           if(sb.charAt(i) == sb.charAt(j)){
               i++;
               j--;
           } else {
               isPalindrome = false;
               break;
           }
       }
       if(isPalindrome){
           System.out.println("Given String is Palindrome");
       } else {
           System.out.println("Given String is not Palindrome");
       }
    }
}
