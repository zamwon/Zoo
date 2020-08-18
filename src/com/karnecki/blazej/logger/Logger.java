package com.karnecki.blazej.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class Logger {
    private File loggingFile;

    public Logger() {
        loggingFile = new File("log.txt");
        try {
            if(!loggingFile.exists()){
                loggingFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void logToLoggingFile() {}

    private static class LoggerHolder {
        private static Logger logger = new Logger();}

    public static Logger getInstance(){
        return LoggerHolder.logger; }

    public void log(Level level, String msg){
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(loggingFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }
}
