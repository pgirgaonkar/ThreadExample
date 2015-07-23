package my.examples.thread;

import java.io.IOException;
import java.util.Vector;

public class FileGenerator extends Thread {

    static final int MAXQUEUE = 5;
    private Vector messages = new Vector();
    private String fileNameWithPath ;

    public FileGenerator(String fileName){
        super();
        this.fileNameWithPath = fileName;
    }

    @Override
    public void run() {
        try {
            while (true) {
                createTestFile();
                //sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }

    private synchronized void createTestFile() throws InterruptedException {
        while (messages.size() == MAXQUEUE) {
            FileSystemUtil fsu = new FileSystemUtil();

            try {
                fsu.createFile(fileNameWithPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            wait();
        }

        messages.addElement(new java.util.Date().toString());
        System.out.println("put message");
        notify();

    }

    public synchronized String getMessage() throws InterruptedException {
        notify();
        while (messages.size() == 0) {
            wait();//By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
        }
        String message = (String) messages.firstElement();// + "Size = " + messages.size();
        messages.removeElement(message);
        return message;
    }
}
