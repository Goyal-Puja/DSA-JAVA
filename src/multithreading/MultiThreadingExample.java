package multithreading;

public class MultiThreadingExample{
    public static void main(String[] args){
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Main Thread exiting");
    }

    public static class MyThread extends Thread{
        private String threadName;
        MyThread(String threadName){

            this.threadName = threadName;
        }
        public void run(){
            System.out.println("Thread "+ threadName +" is running");

            try{
                Thread.sleep(2000);
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("Thread "+ threadName +" exiting");
        }
    }
}

// In the 'main()' method, created two instance of 'multithreading.MultiThreadingExample.MyThread' and start them using the 'start()' method.
// use the join() method to ensure that the main thread waits for the completion of the created threads.

// Each thread prints a message, simulates work by sleeping for 2 seconds , and prints another message before exiting..

// This example demonstrates how multiple threads can run concurrently and perform tasks independently of each other.

// The 'start()' method is used to begin the execution of a thread. it internally calls the 'run() method of the thread. once a thread is started, it enters the 'Runnable' state and the JVM invokes the 'run()' method of the thread.

// The 'run()' method is the entry point for the thread's execution logic. it contains the code that define the behavior of the thread. when the 'run()' method completes its execution, the thread terminates.


// when the start() method is called on a thread object, the JVM initiates a new thread of execution which calls the 'run()' method internally. This allows for concurrent execution of task defined within the 'run()' method