package my.examples.thread;

public class SampleThread extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(10);
            } catch(Exception ex){ex.printStackTrace();}
        }
        ThreadJoin.names.add(getName());
    }
}
