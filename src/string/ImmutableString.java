package string;

public class ImmutableString {
    public static void  main(String[] args){
        String s1 = "Interviewbit";
        String s2 = s1;
        System.out.println(s1 == s2);

        s1 += "Scaler";
        System.out.println(s1 == s2);
    }
}
