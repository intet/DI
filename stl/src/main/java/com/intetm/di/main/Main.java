package com.intetm.di.main;

import com.intetm.di.animal.Animal;
import com.intetm.di.animal.Cat;
import com.intetm.di.animal.Dog;
import com.intetm.di.animal.Kitten;
import com.intetm.di.stl.JavaList;
import com.intetm.di.stl.List;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String ...args){
        List<Animal> animalList = new JavaList<Animal>();
        Cat cat = new Cat();
        Kitten kitten = new Kitten();
        Dog dog = new Dog();

        animalList.add(cat);
        animalList.add(kitten);


        Set<Dog> dogSet = new HashSet<Dog>();
        dogSet.add(dog);

        animalList.addAll(dogSet);
    }
}
