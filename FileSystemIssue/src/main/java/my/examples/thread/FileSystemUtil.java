package my.examples.thread;

import java.io.*;

/**
 * Created by pgirga on 9/10/2014.
 */
public class FileSystemUtil {

    public  void readFile(String fileNameWithPath) throws IOException {

        System.out.println("Inside readFIle... reading file = " + fileNameWithPath);
        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(fileNameWithPath));
            while ((sCurrentLine = br.readLine()) != null) {
            }


        } catch (IOException e) {
            throw e;
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Inside readFIle... reading file = " + fileNameWithPath + "  ...FINISHED...");

    }
    public void createFile(String fileNameWithPath) throws IOException {

        System.out.println("Inside readFIle... writing file = " + fileNameWithPath);
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileNameWithPath), "utf-8"));
            writer.write(getText());
        } catch (IOException ex) {
            throw ex;
        } finally {
            try {writer.close();} catch (Exception ex) {ex.printStackTrace();}
        }
        System.out.println("Inside readFIle... writing file = " + fileNameWithPath + "  ...FINISHED...");

    }

    private String getText(){
        StringBuffer sb = new StringBuffer();
        for ( int i =0; i< 500; i++){
            sb.append(getTextBatch());
        }
        return sb.toString();
    }
    private StringBuffer getTextBatch(){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<1000; i++){
            sb.append("This is a test data. ");
        }
        return sb;
    }
}
