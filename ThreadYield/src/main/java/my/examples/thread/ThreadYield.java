package my.examples.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pgirga on 9/3/2014.
 */
public class ThreadYield  {
    public static void main(String a[]){
        List<SampleThread> list = new ArrayList<SampleThread>();
        for(int i=0;i<3;i++){
            SampleThread et = new SampleThread(i+5);
            list.add(et);
            et.start();
        }
        for(SampleThread et:list){
            try {
                et.join();
            } catch (InterruptedException ex) { }
        }
    }
}

