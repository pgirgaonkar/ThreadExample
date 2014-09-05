package my.examples.thread;

public class SampleThread extends Thread{
    private int suspendCount;
    public SampleThread(int count){
        this.suspendCount = count;
    }
    public void run(){
        for(int i=0;i<50;i++){
            if(i%suspendCount == 0){
                try {
                    System.out.println("Thread Sleep: " + getName());
                    Thread.sleep(500);
                } catch (InterruptedException ex) {ex.printStackTrace(); }
            }
        }
    }
}
