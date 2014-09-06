package my.examples.thread;

public class SampleThread extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            try{
                Thread.sleep(1000);
            } catch(Exception ex){
                ex.printStackTrace();
                /*Turn Following ON for Interrupt*/
                //throw new RuntimeException(ex.getMessage());
            }
        }

        System.out.println("Adding Thread = " + getName());
        ThreadJoin.names.add(getName());
    }
}
