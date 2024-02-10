package multithreading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("running a thread");
    }
}

public class RunnableExample {
    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}


// This approach is preferred in java because it allows the class to extend other classes if necessary, promoting better code organization and flexibility.