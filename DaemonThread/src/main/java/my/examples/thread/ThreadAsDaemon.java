package my.examples.thread;

/**
 * Created by pgirga on 9/3/2014.
 */

public class ThreadAsDaemon extends Thread{

    public ThreadAsDaemon(){
        setDaemon(true);
    }
    public void run(){
        System.out.println("Is this thread Daemon? - "+isDaemon());
        System.out.println("Is this thread Daemon? - "+isDaemon());
    }
}