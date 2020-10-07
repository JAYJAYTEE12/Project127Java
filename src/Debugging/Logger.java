package Debugging;

import java.io.*;

import static Debugging.DebugUtils.*;

public class Logger {

    public static String logName = "debug.txt";
    public static Boolean disableLogger = false;

    public Logger(){
        try{
            File loggerFile = new File(logName);
            if(loggerFile.createNewFile()){
                FileWriter writer = new FileWriter(logName);
                writer.write(getTime() + " Successfully created logger file!");
                writer.write(System.getProperty("line.separator"));
                writer.close();
            }else{
                System.out.println("File already exists!");
            }
        }catch(IOException e){
            System.out.println("An error occurred whilst creating the debug file.");
            e.printStackTrace();
        }
    }

    public static void log(String message, boolean disableLogging, int logLevel){
        if(!disableLogging) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(logName, true));
                writer.write(getTime() + " " + message + " - " + logLevel);
                writer.write(System.getProperty("line.separator"));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("There was an unknown error whilst writing to a log file!");
            }
        }
    }
}
