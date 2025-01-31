package java8;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Run method called");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args){
        Thread thread = new Thread(new ThreadDemo());  // traditional way to create thread
        thread.start();

        // to create thread by using lambda expression
        Runnable runnable = () -> System.out.println("Run method called using lambda");
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
