package StringBuilder_StringBuffer;

public class StringBuilderExample {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        Thread thread1 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                stringBuffer.append("A");
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                stringBuffer.append("a");
                stringBuilder.append("a");
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (Exception ex){
            ex.printStackTrace();
        }
      //  System.out.print(sb.toString());
        System.out.println(stringBuffer.toString().length());
        System.out.println(stringBuffer.toString().length());
    }
}
//String Builder is not thread safe   --- faster -- it is not synchronized
// String Buffer is thread safe   -- slower as compared to string Builder ---- it is synchronized

// if we are working with singly thread environment and we don't need thread safety in this case, we can prefer string builder... due to its better performance

// if our application requires thread safety, especially for multi threading environment then we should use string buffer..