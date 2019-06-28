package com.mobileapps.week02test.JavaExercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise03
{

    /*
        3. Given a 2d String array, write a method that will return a list with all the positions of
             dulpicate entries.   For example:

                    a,b,c
                    d,e,f
                    g,a,b

            will return {0,0 | 0,1 | 2,1 | , 2,2 }
     */


    public static void main(String[] args)
    {

        String[][] string2d = {{"a","b","c"},{"d","e","f"},{"g","a","b"}};

        List<String> positions = getPositions(string2d);


        for (int i=0;i<positions.size();i++)
        {
            System.out.println(positions.get(i));
        }
    }

    private static List<String> getPositions(String[][] string2d)
    {
        List<String> positions = new ArrayList<>();

        for (int i=0;i<string2d.length;i++)
        {
            for(int j =0;j<string2d[0].length;j++)
            {
                String aux = string2d[i][j];
                if(isRepited(aux,string2d,i,j))
                {
                    positions.add(i+","+j);
                }
            }
        }


        return positions;
    }

    private static boolean isRepited(String stringToCheck, String[][] string2d, int vali, int valj)
    {
        for (int i=0;i<string2d.length;i++)
        {
            for(int j =0;j<string2d[0].length;j++)
            {
                if(i!=vali && i!=valj)
                {
                    if (string2d[i][j].equals(stringToCheck))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }


}
