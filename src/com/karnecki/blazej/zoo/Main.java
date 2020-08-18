package com.karnecki.blazej.zoo;

import com.karnecki.blazej.animals.IllegalAnimalAgeException;
import com.karnecki.blazej.animals.IllegalAnimalNameException;
import com.karnecki.blazej.animals.IllegalAnimalWeightException;
import com.karnecki.blazej.animals.Tiger;
import com.karnecki.blazej.logger.Level;

public class Main {



    public static void main(String[] args) throws IllegalAnimalAgeException, IllegalAnimalWeightException, IllegalAnimalNameException {
        Zoo zoo = new Zoo();
        zoo.myLogger.log(Level.INFO, "Create zoo singleton");
        zoo.myLogger.log(Level.ERROR, "Cannot create another zoo - zoo already exist");



            Tiger tiger1 = new Tiger.TigerBuilder()
                    .setAge(1)
                    .setWeight(20)
                    .setName("Tigr")
                    .build();
            Tiger tiger2 = new Tiger.TigerBuilder()
                    .setAge(10)
                    .setWeight(200)
                    .setName("Tigy")
                    .build();
        Tiger tiger3 = new Tiger.TigerBuilder()
                .setAge(5)
                .setWeight(100)
                .setName("Tigro")
                .build();

        System.out.println(tiger1.toString() + "\n" + tiger2.toString() + "\n" + tiger3.toString());

    }
}