package com.epam.mjc.stage0;

public class Main 
{
    public static void main(String[] args)
	{
        Animal animal = new Animal("orange", 4, true);
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}