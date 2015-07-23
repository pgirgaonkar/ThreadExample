package my.examples.thread;

public class Subscriber extends Thread {

    Publisher publisher;

    Subscriber(Publisher p) {
        publisher = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = publisher.getMessage();
                System.out.println("Got message: " + message);
                //sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
