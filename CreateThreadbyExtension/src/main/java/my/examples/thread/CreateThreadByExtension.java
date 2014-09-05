package my.examples.thread;

/**
 * Created by pgirga on 9/3/2014.
 */
public class CreateThreadByExtension extends Thread{
    public static int myCount = 0;
    public void run(){
        while(CreateThreadByExtension.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++CreateThreadByExtension.myCount));
                Thread.sleep(500);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
