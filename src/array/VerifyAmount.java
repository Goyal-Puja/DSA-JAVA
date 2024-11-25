package array;

import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;

import java.util.HashMap;

public class VerifyAmount {
    public static int convertToDigit(String words){
        HashMap<String, Integer> wordToNum = new HashMap<>();
        wordToNum.put("zero", 0); wordToNum.put("one", 1); wordToNum.put("two", 2); wordToNum.put("three", 3);
        wordToNum.put("four", 4); wordToNum.put("five", 5); wordToNum.put("six", 6); wordToNum.put("seven", 7);
        wordToNum.put("eight", 8); wordToNum.put("nine", 9); wordToNum.put("ten", 10); wordToNum.put("eleven", 11);
        wordToNum.put("twelve", 12); wordToNum.put("thirteen", 13); wordToNum.put("fourteen", 14);
        wordToNum.put("fifteen", 15); wordToNum.put("sixteen", 16); wordToNum.put("seventeen", 17);
        wordToNum.put("eighteen", 18); wordToNum.put("nineteen", 19); wordToNum.put("twenty", 20);
        wordToNum.put("thirty", 30); wordToNum.put("forty", 40); wordToNum.put("fifty", 50);
        wordToNum.put("sixty", 60); wordToNum.put("seventy", 70); wordToNum.put("eighty", 80);
        wordToNum.put("ninety", 90); wordToNum.put("hundred", 100); wordToNum.put("thousand", 1000);
        wordToNum.put("lakh", 100000); wordToNum.put("crore", 10000000);

        String[] parts = words.split("-");

        int total = 0;
        int currentValue = 0;

        for(String part : parts){
            part = part.replaceAll("-", "");
            Integer value = wordToNum.get(part);
            if(value != null){
                if(value != 100 && value != 1000 && value != 100000 && value != 10000000){
                    currentValue += value;
                } else {
                    currentValue *= value;
                    total += currentValue;
                    currentValue = 0;
                }
            } else {
                return -1;
            }

        }
        total += currentValue;
        return total;
    }
    public static int verifyAmount(String num,String words){
        return Integer.parseInt(num) == convertToDigit(words) ? 1 : 0;
    }
    public static void main(String[] args){
        String num = "26";
        String words = "twenty-s-ix";
        System.out.println(verifyAmount(num, words));
    }
}
//one   - 1
// thousand  1 * 1000    total = 1000
//        two 2
//hundred 2*100 - 200     total = 1200
//                thirty  -- 30
//four 34                total = 1200 + 34 = 1234