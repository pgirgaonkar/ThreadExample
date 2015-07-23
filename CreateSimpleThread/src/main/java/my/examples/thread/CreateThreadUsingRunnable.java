package my.examples.thread;

/**
 * Created by pgirga on 9/3/2014.
 */
public class CreateThreadUsingRunnable  implements Runnable{

    public static int myCount = 0;
    public CreateThreadUsingRunnable(){

    }
    public void run() {
        while(CreateThreadUsingRunnable.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++CreateThreadUsingRunnable.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
