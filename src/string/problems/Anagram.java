package string.problems;

import java.util.Arrays;
public class Anagram
{

    public static boolean checkAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false; // if cat == mary false
        }
        if(str1.toLowerCase().equals(str2.toLowerCase()))
        {
            return false; // if cat = cat then false, same char same order
        }

        char[] chr1 = str1.toLowerCase().toCharArray();
        char[] chr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);

        for (int i = 0; i < chr1.length; i++)
        {
            if(chr1[i] != chr2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "cat";
        String str2 = "ACT";
        if (checkAnagram(str1, str2))
        {
            System.out.print("Is anagram");
        }
        else {
            System.out.print("is not anagram");
        }
    }
}
