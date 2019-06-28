package com.mobileapps.week02test.JavaExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise02
{

    /*
            2. Say you have a string of characters. Write an algorithm to collect and return a
            list of all substrings such that order is maintained but characters may be skipped.
            So “frog” can produce fog, fg, rg, etc.
     */

    public static void main(String[] args) {

        String word = "frog";

        List<String> substrings;

        substrings = getSubString(word);
        for (int i = 0; i<substrings.size();i++)
        {
            System.out.println(substrings.get(i));
        }

    }

    private static List<String> getSubString(String word)
    {
        List<String> aux = new ArrayList<>();
        for (int i = 0; i< word.length() ; i++)
        {
            int loop = 1;

            while (loop < word.length())
            {
                String simpleString = ""+word.charAt(i);

                for (int j = i + loop; j < word.length(); j++) {
                    simpleString = simpleString + word.charAt(j);
                    //aux.add(simpleString);
                }

                if (simpleString.length() != 1)
                    aux.add(simpleString);
                loop++;
            }
        }
        return aux;
    }
}
