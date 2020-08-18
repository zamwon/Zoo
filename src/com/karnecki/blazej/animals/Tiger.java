package com.karnecki.blazej.animals;

public class Tiger extends Animal implements Cat {
    private static final int MIN_WEIGHT = 10;
    private static final int MAX_WEIGHT = 400;
    private static final int MAX_AGE = 15;
    private static final int MIN_AGE = 1;
    private static final String ILLEGAL_NAME = "Invalid name for tiger, name cannot be null or blank";
    private static final String ILLEGAL_WEIGHT = "Invalid tiger weight, weight cannot be lower then 10 kg and higer than 400 kg";
    private static final String ILLEGAL_AGE = "Invalid tiger age, age cannot be lower then 1 year and higer than 15 years";
    Tiger(TigerBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
    }
    public static class TigerBuilder extends Animal implements Cat {
        public TigerBuilder setName(String name) throws IllegalAnimalNameException {
            if (name == null || name.isEmpty()) {
                throw new IllegalAnimalNameException((ILLEGAL_NAME));
            } else {
                this.name = name;
                return this;
            }
        }
        public TigerBuilder setAge(int age) throws IllegalAnimalAgeException {
            if (age < MIN_AGE || age > MAX_AGE) {
                throw new IllegalAnimalAgeException((ILLEGAL_AGE));
            } else {
                this.age = age;
                return this;
            }
        }
        public TigerBuilder setWeight(double weight) throws IllegalAnimalWeightException {
            if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
                throw new IllegalAnimalWeightException((ILLEGAL_WEIGHT));
            } else {
                this.weight = weight;
                return this;
            }
        }
        public Tiger build() {
            return new Tiger(this);
        }

    }

    @Override
    public String toString() {
        return "Tiger -> " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight;
    }
}