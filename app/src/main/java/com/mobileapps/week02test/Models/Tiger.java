package com.mobileapps.week02test.Models;

public class Tiger extends Species {


    public Tiger() {
    }

    @Override
    public void sleep()
    {
        addEnergy(5);
    }

    @Override
    public void setName(String name) {
        super.setName("Tiger");
    }

    //11. Tigers can't eat grain because they have sensitive digestive systems.
    @Override
    public void eat(String food) {
        if(!food.equals("grain"))
            super.eat(food);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Grooouss Grrou I'm a Tiger");
    }
}
