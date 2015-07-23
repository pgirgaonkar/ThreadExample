package my.examples.thread;

/**
 * Created by pgirga on 9/5/2014.
 */
public class FileSystemIssue {
    public static void main(String args[]) {

        String fileNameWithPath;
        //fileNameWithPath = "C:\\temp\\Mytestfile.txt";

        fileNameWithPath = args[0];

        FileGenerator fileGenerator = new FileGenerator(fileNameWithPath);
        fileGenerator.start();
        new FileConsumer(fileGenerator,fileNameWithPath).start();
    }
}


