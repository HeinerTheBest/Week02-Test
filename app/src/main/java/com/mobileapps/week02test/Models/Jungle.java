package com.mobileapps.week02test.Models;

import java.util.ArrayList;
import java.util.List;

public class Jungle
{
    private List<Monkey> monkeys = new ArrayList<>();
    private List<Snake>  snakes  = new ArrayList<>();
    private List<Tiger>  tigers  = new ArrayList<>();

    public void createTiger()
    {
        tigers.add(new Tiger());
    }

    public void createSnake()
    {
        snakes.add(new Snake());
    }

    public void createMonkey()
    {
        monkeys.add(new Monkey());
    }

    public int getCountTiger()
    {
       return tigers.size();
    }

    public int getCountSnakes()
    {
        return snakes.size();
    }

    public int getCountMonkeys()
    {
        return monkeys.size();
    }

    public Tiger getTiger(int i)
    {
        if(i<tigers.size())
            return tigers.get(i);
        else
            return null;
    }

    public Monkey getMonkey(int i)
    {
        if(i<monkeys.size())
            return monkeys.get(i);
        else
            return null;
    }

    public Snake getSnake(int i)
    {
        if(i<snakes.size())
            return snakes.get(i);
        else
            return null;
    }

    public void soundOff()
    {
        for (Monkey monkey:monkeys)
        {
            monkey.makeSound();
        }

        for (Snake snake:snakes)
        {
            snake.makeSound();
        }

        for (Tiger tiger:tigers)
        {
            tiger.makeSound();
        }
    }




}
