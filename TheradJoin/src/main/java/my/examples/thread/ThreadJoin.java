package my.examples.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pgirga on 9/3/2014.
 */

public class ThreadJoin {

    public static List<String> names = new ArrayList<String>();

    public static void main(String a[]){
        List<SampleThread> list = new ArrayList<SampleThread>();
        for(int i=0;i<5;i++){
            SampleThread s = new SampleThread();
            list.add(s);
            s.start();
        }

        for(SampleThread st:list){
            try{
                st.join();
            } catch (Exception ex){ex.printStackTrace();}
        }

        /*
        // can explain interrupt better here.
        for(SampleThread st:list){
            try{
                st.interrupt();
            } catch (Exception ex){ex.printStackTrace();}
        }*/
        System.out.println(names);
    }
}

