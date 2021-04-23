package com.adilah.animal;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Animal animaldog = new Dog();
        animaldog.makeNoise();

        if(animal instanceof Animal){
            System.out.println("Animal is Animal");
        }
        if(dog instanceof Animal) {
            System.out.println("Dog is Animal");
        }
        if(animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }
        if(animal instanceof Dog) {
            System.out.println("Animal is Dog");
        }
    }
}