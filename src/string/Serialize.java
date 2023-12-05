//Input :  A = ['scaler', 'academy']
//Output : scaler6~academy7~

package string;

import java.util.ArrayList;
import java.util.Arrays;

public class Serialize {
        public static void main(String[] args){
            ArrayList<String> arr = new ArrayList<>(Arrays.asList("Scaler", "academy"));
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<arr.size();i++){
                stringBuilder.append(arr.get(i));
                stringBuilder.append(arr.get(i).length());
                stringBuilder.append("~");
            }
            System.out.println(stringBuilder);
        }
    }
