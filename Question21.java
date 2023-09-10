/*
Anagram Strings
Write a function to check whether the given strings are anagrams or not. If the given strings are anagram then return ‘yes’ otherwise return ‘no’?

Sample Test Case 1:
Input:  1st: learnprogramo
        2nd: simple
Output: no

Sample Test Case 2:
Input:  1st: Listen
        2nd: Silent
Output: yes

Explanation:
The two strings Listen and Silent are anagrams because rearranging all the characters from the second string forms the first string.

Product Small Pair
*/

import java.util.*;

public class Question21 
{
    static String checkAnagram( String str1, String str2)
    {
        if( str1.length()!=str2.length() )
        {
            //length of the strings are uneqaul then not anagram
            return "no";
        }

        //here simply using a hashmap to count and store every character appearance 
        HashMap<Character,Integer>map=new HashMap<>();
        for( int i=0 ; i<str1.length() ; i++ )
        {
            //take dafault value is 0 and if appaer then increase
            map.put( str1.charAt(i), map.getOrDefault( str1.charAt(i),0)+1);
        }
        for( int i=0 ; i<str2.length() ; i++ )
        {
            if( !map.containsKey(str2.charAt(i)))
            {
                //if any character is not present in the 2nd string means not anagram  
                return "no";
            }
            else
            {
                //if present remove 1 apperance
                if( map.get(str2.charAt(i))==1 )
                {
                    map.remove(str2.charAt(i));
                }
                else
                {
                    map.put( str1.charAt(i), map.get( str1.charAt(i))-1);
                }
            }
        }

        if( !map.isEmpty() )
        {
            //after all the operation map is not empty means not anagram
            return "no";
        }

        return "yes";
    }

    public static void main(String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        String str1=Sc.next();
        String str2=Sc.next();
        System.out.print( checkAnagram(str1, str2) );
    }
}
