package com.mobileapps.week02test.Models;

public class Monkey extends Species {

    public Monkey() {
    }

    @Override
    public void sleep() {
        addEnergy(2);
    }

    @Override
    public void makeSound() {
        minusEnergy(4);
        System.out.println("Uh uh ah I'm a monkey");
    }

    @Override
    public void setName(String name) {
        super.setName("Monkey");
    }

    public void play()
    {
        if(getEnergy()>=8)
        {
            System.out.println("Oooo Oooo Oooo" );
            minusEnergy(8);
        }
        else
        {
            System.out.println("Monkey is too tired");
        }
    }


}
