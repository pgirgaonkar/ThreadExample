package my.examples.thread;

public class RunThread {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        CreateThreadByExtension ctbe = new CreateThreadByExtension();
        ctbe.start();
        while(CreateThreadByExtension.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++CreateThreadByExtension.myCount));
                Thread.sleep(1000);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
