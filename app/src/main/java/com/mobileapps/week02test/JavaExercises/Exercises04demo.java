package com.mobileapps.week02test.JavaExercises;

import com.mobileapps.week02test.Models.Jungle;
import com.mobileapps.week02test.Models.Tiger;

public class Exercises04demo
{
    public static void main(String[] args) {
        Jungle jungle = new Jungle();


        //Tigers
        jungle.createTiger();
        jungle.getTiger(0).eat("ice");
        jungle.createTiger();
        jungle.getTiger(1).makeSound();
        jungle.createTiger();
        jungle.getTiger(2).eat("grain");

        System.out.println("Energy tiger01 "+jungle.getTiger(0).getEnergy());
        System.out.println("Energy tiger02 "+jungle.getTiger(1).getEnergy());
        System.out.println("Energy tiger03 "+jungle.getTiger(2).getEnergy());

        System.out.println("We have: "+jungle.getCountTiger()+" Tigers");

        System.out.println("\n");

        //Snakes
        jungle.createSnake();
        jungle.getSnake(0).eat("Mouse");
        jungle.createSnake();
        jungle.getSnake(1).sleep();
        jungle.getSnake(1).makeSound();

        System.out.println("Energy snake01 "+jungle.getSnake(0).getEnergy());
        System.out.println("Energy snake02 "+jungle.getSnake(1).getEnergy());

        System.out.println("We have: "+jungle.getCountSnakes()+" Snakes");

        System.out.println("\n");


        //Monkeys
        jungle.createMonkey();
        jungle.getMonkey(0).play();
        jungle.getMonkey(0).play();
        jungle.getMonkey(0).play();
        jungle.getMonkey(0).sleep();
        jungle.getMonkey(0).play();

        System.out.println("We have: "+jungle.getCountMonkeys()+" Monkeys");


        System.out.println("\n");


        jungle.soundOff();











    }
}
