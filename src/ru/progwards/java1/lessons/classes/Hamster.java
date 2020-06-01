package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    Hamster(double weight){
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff() {
        return 0.03;
    }

    public static void main(String[] args) {
        Hamster ham = new Hamster(5.0);
        System.out.println(ham.toStringFull());
    }
}