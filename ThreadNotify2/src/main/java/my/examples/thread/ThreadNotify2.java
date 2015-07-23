package my.examples.thread;

/**
 * Created by pgirga on 9/5/2014.
 */
public class ThreadNotify2 {
    public static void main(String args[]) {
        Publisher publisher = new Publisher();
        publisher.start();
        new Subscriber(publisher).start();
    }
}


