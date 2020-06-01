package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;
    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK
    }
    enum FoodKind {
        UNKNOWN,
        HAY, CORN
    }

    public Animal(double weight){
        this.weight = weight;
    }

    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
    }
    public double getWeight(){
        return weight;
    }
    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        double wg = weight*getFoodCoeff();
        return wg;
    }
    public String toStringFull(){
        return toString() + " <" + calculateFoodWeight() + ">";
    }
    @Override
    public String toString() {
        return "I am <"+ getKind() + ">, eat <" + getFoodKind() +">";
    }

    public static void main(String[] args) {
        
    }
}
