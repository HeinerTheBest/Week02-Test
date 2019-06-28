package com.mobileapps.week02test.Models;

public class Snake extends Species {

    public Snake() {
    }

    @Override
    public void setName(String name) {
        super.setName("Snake");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("ShhhShhh I'm a snake");
    }
}
