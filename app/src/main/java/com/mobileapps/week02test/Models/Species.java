package com.mobileapps.week02test.Models;

import com.mobileapps.week02test.Interfaces.AnimalInterface;

public class Species implements AnimalInterface
{
    private String name;
    private int energy = 22;



    public String getName() {
        return name;
    }

    public void addEnergy(int n)
    {
        energy = energy+n;
    }

    public void minusEnergy(int n)
    {
        energy = energy-n;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public void makeSound()
    {
        energy = energy-3;
    }

    @Override
    public void sleep()
    {
        energy = energy + 5;
    }

    @Override
    public void eat(String food)
    {
        energy = energy + 10;
    }
}
