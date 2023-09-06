/*
    Question 3: Password Checker
    (Asked in Accenture OnCampus 10 Aug 2021, Slot 3)

    You are given a function.
    int CheckPassword(char str[], int n);
    The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
    str is a valid password if it satisfies the below conditions.

    – At least 4 characters
    – At least one numeric digit
    – At Least one Capital Letter
    – Must not have space or slash (/)
    – Starting character must not be a number
    Assumption:
    Input string will not be empty.

    Example:

    Input 1:    aA1_67
    Input 2:    a987 abC012

    Output 1:   1
    Output 2:   0
*/

import java.util.*;

public class Question3
{
    //function that check the password is correct or not
    static int checkPassword( String str, int n)
    {
        if( n<4 )
        {
            //At least 4 characters
            return 0;
        }

        if( str.charAt(0)>='0' && str.charAt(0)<='9' )
        {
            //Starting character must not be a number
            return 0;
        }

        int cap=0,num=0;
        for( int i=0 ; i<n ; i++ )
        {
            char ch=str.charAt(i);

            if( ch==' ' || ch=='/' )
            {
                //Must not have space or slash (/)
                return 0;
            }
            
            //numeric digit count
            if( ch>='0' && ch<='9' )
            {
                num++;
            }

            //Capital Letter count
            if( ch>='A' && ch<='Z' )
            {
                cap++;
            }
        }

        //check at least 1 capital letter and 1 numerical digit present
        if( cap>0 && num>0 )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();   //input string
        //function call and print
        System.out.print( checkPassword( str, str.length() ));
    } 
}