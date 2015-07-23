package my.examples.thread;

import java.io.IOException;

public class FileConsumer extends Thread {

    private FileGenerator fileGenerator;
    private String fileNameWithPath;

    FileConsumer(FileGenerator p, String fileNameWithPath) {
        fileGenerator = p;
        this.fileNameWithPath = fileNameWithPath;
    }




    @Override
    public void run() {
        try {
            while (true) {

                FileSystemUtil fsu = new FileSystemUtil();
                try {
                    fsu.readFile(fileNameWithPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String message = fileGenerator.getMessage();
                System.out.println("Got message: " + message);
                //sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
