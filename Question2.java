/*
    Question 2: 
    (Asked in Accenture OnCampus 10 Aug 2021, Slot 2)

    Problem Description :
    The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

    int OperationsBinaryString(char* str);

    The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

    – A denotes AND operation
    – B denotes OR operation
    – C denotes XOR Operation
    You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

    Note:

    No order of priorities of operations is required
    Length of str is odd
    If str is NULL or None (in case of Python), return -1
    Input:
    str: 1C0C1C1A0B1

    Output:
    1

    Explanation:
    The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.

    Sample Input:
    0C1A1B1C1C1B0A0

    Output:
    0
*/

import java.util.*;

public class Question2 
{
    static int OperationsBinaryString( String str)
    {
        int ans=str.charAt(0)-'0';
        for( int i=1 ; i<str.length() ; i++ )
        {
            char ch=str.charAt(i);
            i++;    //increment the poiter to getting the digit
            if( ch=='A' )   //for and operatio
            {
                ans=ans & ( str.charAt(i)-'0' );
            }
            else if( ch=='B' )      //for or operation
            {
                ans=ans | ( str.charAt(i)-'0' );
            }
            else    //for xor operation
            {
                ans=ans ^ ( str.charAt(i)-'0' );
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);

        String str=Sc.next();   //enter the string

        int ans=OperationsBinaryString( str);   //call method
        System.out.print(ans);    //print the answer
    }  
}
