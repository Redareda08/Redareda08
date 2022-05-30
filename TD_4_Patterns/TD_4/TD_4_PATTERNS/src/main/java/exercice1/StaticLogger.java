package exercice1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class StaticLogger {
    private static String DIR="out";
    private static String LOGS_FILE_PATH= DIR + "\\logs.txt";

    public static void write(Level l, String error){
        writeToFile(l,error,LOGS_FILE_PATH);
    }

    private static void writeToFile(Level l, String error, String FileName) {

        java.util.Date date= new java.util.Date();

        try (FileWriter writer = new FileWriter(FileName, true);
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(new Timestamp(new java.util.Date().getTime()).toString() + " " + l + " " + error + "\n");
            bw.close();

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    }
}
