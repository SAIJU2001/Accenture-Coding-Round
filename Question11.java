/*
(Asked in Accenture Offcampus 1 Aug 2021, Slot 3)

Problem Statement

You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.
*/

import java.util.*;

public class Question11 
{
    public static void replaceCharacter( String str, int n, char ch1, char ch2)
    {
        //if string is null or characters not given then print the string
        if( n==0 || (ch1==' ' && ch2==' ') )
            System.out.print(str);

        String result="";

        for( int i=0 ; i<n ; i++ )
        {
            char ch=str.charAt(i);

            if( ch==ch1 )
            {
                //if current char and ch1 are same replace that char to ch2
                result+=ch2;
            }
            else if( ch==ch2 )
            {
                //if current char and ch2 are same replace that char to ch1
                result+=ch1;
            }
            else
            {
                //if current char is not same with ch1 or ch20 that char added to result
                result+=ch;
            }
        }
        System.out.print(result);
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();       //enter the string
        char ch1=Sc.next().charAt(0);   //input ch1 
        char ch2=Sc.next().charAt(0);   //input ch2
        replaceCharacter(str, str.length(), ch1, ch2);
    }  
}
