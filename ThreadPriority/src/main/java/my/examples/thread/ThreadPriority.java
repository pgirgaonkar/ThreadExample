package my.examples.thread;

/**
 * Created by pgirga on 9/5/2014.
 */
public class ThreadPriority  implements Runnable{

    public synchronized void run() {
        System.out.println("Starting Implementation of Thread "+Thread.currentThread().getName());
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread "+Thread.currentThread().getName()+" value : "+i );
        }
        System.out.println("Ending Implementation of Thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Program starts...");
        ThreadPriority th1 = new ThreadPriority();
        Thread t1 = new Thread(th1);
        t1.setPriority(8);
        t1.setName("Thread-1");
        synchronized(t1)
        {
            t1.start();
        }

        ThreadPriority th2 = new ThreadPriority();
        Thread t2 = new Thread(th2);
        t2.setName("Thread-2");
        t2.setPriority(9);
        synchronized (t2) {
            t2.start();
        }

        ThreadPriority th3 = new ThreadPriority();
        Thread t3 = new Thread(th3);
        t3.setName("Thread-3");
        synchronized (t3) {
            t3.start();
        }

        System.out.println("Thread Priority :: T1 = " + t1.getPriority());
        System.out.println("Thread Priority :: T2 = " + t2.getPriority());
        System.out.println("Thread Priority :: T3 = " + t3.getPriority());

        System.out.println("Program ends...");
    }
}