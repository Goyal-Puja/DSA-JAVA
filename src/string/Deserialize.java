package string;

import java.util.ArrayList;

public class Deserialize {
    public static void main(String[] args){
        String str = "scaler6~academy7~";
        String[] arr = str.split("[0-9]+~");
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        System.out.println(res);
    }
}
