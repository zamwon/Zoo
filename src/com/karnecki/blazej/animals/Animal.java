package com.karnecki.blazej.animals;

import java.util.Random;

public abstract class Animal {
    String name;
    int age;
    double weight;
    public Animal() {
    }
    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void setAge(int min, int max) {
        if (max > min) {
            Random random = new Random();
            this.age = random.nextInt(max - min) + min;
        } else {
            throw new IllegalArgumentException("wrong arguments, max must be grater than min");
        }
    }
    public void setWeight(double min, double max) {
        Random random = new Random();
        if (max > min) {
            this.weight = min + (max - min) * random.nextDouble();
        } else {
            throw new IllegalArgumentException("wrong arguments, max must be grater than min");
        }
    }

}