package my.examples.thread;

/**
 * Created by pgirga on 9/3/2014.
 */
public class RunDaemon {
    public static void main(String a[]){
        ThreadAsDaemon tad = new ThreadAsDaemon();
        // even you can set daemon constrain here also
        // it is like dt.setDeamon(true)
        tad.start();
    }
}
