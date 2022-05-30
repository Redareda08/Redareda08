package exercice1_singleton;

import exercice1.Level;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class SingletonFileLogger  implements ILogger{
    private final String DIR="out";
    private final String LOGS_FILE_PATH = DIR + "\\logs.txt";
    private static SingletonFileLogger logger;

    public void write(Level l, String error){
        writeToFile(l,error,LOGS_FILE_PATH);
    }

    private void writeToFile(Level l, String error, String FileName) {

        java.util.Date date= new java.util.Date();

        try (FileWriter writer = new FileWriter(FileName, true);
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(new Timestamp(new java.util.Date().getTime()).toString() + " " + l + " " + error + "\n");
            bw.close();
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    private SingletonFileLogger(){

    }

    public static  synchronized SingletonFileLogger getInstance(){
        if (logger == null)
            logger = new SingletonFileLogger();
            return logger;

    }

}
