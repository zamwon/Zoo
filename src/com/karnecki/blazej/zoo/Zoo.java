package com.karnecki.blazej.zoo;

import com.karnecki.blazej.logger.Level;
import com.karnecki.blazej.logger.Logger;

public class Zoo {
    public String name;
    public String adress;

    Logger myLogger = Logger.getInstance();

    public void addAnimal(){
        myLogger.log(Level.INFO, "Animal created");
    }

}