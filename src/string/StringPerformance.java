package string;

public class StringPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String str1 = "India";
            String str2= "India";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to create literal String : " + (endTime - startTime) + " ms");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String str1 = new String("India");
            String str2 = new String("India");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken to create Object String : " + (endTime1 - startTime1) + " ms");
    }
}