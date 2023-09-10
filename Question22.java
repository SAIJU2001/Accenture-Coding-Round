/*
Reverse a String
Q.10 Write a function that will accept strings from the user and will reverse the string word-wise. The last word will come as the first word in the output and vice versa?

Sample Test Case 1:

Input:  learn programo
Output: programo learn

Explanation:
The reverse string word-wise function is applied.

Sample Test Case 2:

Input:  Welcome to Learnprogramo
Output: Learnprogramo to Welcome
*/

import java.util.*;

public class Question22 
{
    static String reverseString( String str )
    {
        String sarr[]=str.split(" ");   //split the string by space character
        String newStr="";
        for( int i=0 ; i<sarr.length ; i++ )
        {
            //everytime add the present string first
            newStr=sarr[i]+" "+newStr;
        }
        return newStr;
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();       //input string
        System.out.print( reverseString(str) ); //function call and print the result
    }
}
