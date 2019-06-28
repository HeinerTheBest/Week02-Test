package com.mobileapps.week02test.JavaExercises;

import com.mobileapps.week02test.Models.Tiger;

import java.util.ArrayList;

public class Exercise01
{

    /*
    1. Sort the array with multiple same values in the array in an ascending order.
        Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
        Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
    */

    public static void main(String[] args) {
        System.out.println("Hello Heiner ");
        int list[] = {2,8,9,3,4,3,2,6,6,2,4,9,8};

        list = sortArray(list);

        for (int i:list)
        {
            System.out.println(i);
        }
    }


    public static int[] sortArray(int[] list)
    {
        for (int i=0; i<list.length ; i++)
        {
            for (int j=i+1; j<list.length ; j++)
            {
                if (list[i]>list[j])
                {
                    int aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }

        return list;
    }


}
