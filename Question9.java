/*
    Question:9
    (Asked in Accenture Offcampus 1 Aug 2021, Slot 1)

    Implement the following functions.a

    char*MoveHyphen(char str[],int n);

    The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

    NOTE:- Return null if str is null.

    Example :-

    Input:
    str.Move-Hyphens-to-Front
    Output:
    —MoveHyphenstoFront
    Explanation:-

    The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

    Sample Input

    Str: String-Compare
    Sample Output-

    -StringCompare
*/

import java.util.*;

public class Question9 
{
    static String moveHyphen( String str, int n )
    {
        String result="";
        for( int i=0 ; i<n ; i++ )
        {
            if( str.charAt(i)=='-' )
            {
                //if hipens appear add to the first 
                result=str.charAt(i)+result;
            }
            else
            {
                //if other char appears add as it is
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();   //enter the string
        //function call and print the result
        System.out.print( moveHyphen( str, str.length() ) );    
    }
}
