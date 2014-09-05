package my.examples.thread;

public class RunMyThread {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        CreateThreadUsingRunnable mrt = new CreateThreadUsingRunnable();
        Thread t = new Thread(mrt);
        t.start();
        while(CreateThreadUsingRunnable.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++CreateThreadUsingRunnable.myCount));
                Thread.sleep(500);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
