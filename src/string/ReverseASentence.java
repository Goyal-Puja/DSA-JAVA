package string;

import java.util.Scanner;

public class ReverseASentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuilder ReverseStr = new StringBuilder();

        for(int i=0;i< arr.length;i++){
            if(!arr[i].isEmpty()){
                ReverseStr.insert(0,arr[i]);
                if(i < arr.length-1)
                    ReverseStr.insert(0," ");

            }
        }
        System.out.print(ReverseStr);
    }
}
