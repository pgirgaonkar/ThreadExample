package my.examples.thread;

/**
 * Created by pgirga on 9/5/2014.
 */

/**
 * ALSO TRY WITHOUT SYNCHRONIZED OPTION
 */
public class ThreadNotify{
    public static void main(String[] args){
        SampleThread st = new SampleThread();
        st.start();

        synchronized(st){
            try{
                System.out.println("Waiting for SampleThread to complete...");
                st.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Total wait in millisecond is: " + st.total);
        }
    }
}

/*
public class SampleThread extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    }
}
 */