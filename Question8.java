/*
    Question:8
    (Asked in Accenture OnCampus 12 Aug 2021, Slot 2)

    N-base notation is a system for writing numbers that uses only n different symbols, This symbols are the first n symbols from the given notation list(Including the symbol for o) Decimal to n base notation are (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)

    Implement the following function

    Char* DectoNBase(int n, int num):

    The function accept positive integer n and num Implement the function to calculate the n-base equivalent of num and return the same as a string

    Steps:

    Divide the decimal number by n,Treat the division as the integer division
    Write the the remainder (in  n-base notation)
    Divide the quotient again by n, Treat the division as integer division
    Repeat step 2 and 3 until the quotient is 0
    The n-base value is the sequence of the remainders from last to first
    
    Assumption:
    1 < n < = 36

    Example

    Input :     n: 12
                num: 718

    Output :    4BA

    Explanation

    num       Divisor       quotient       remainder

    718           12               59                 10(A)

    59             12                4                   11(B)

    4               12                0                   4(4)

    Sample Input :      n: 21
                        num: 5678

    Sample Output :     CI8
*/

import java.util.*;

public class Question8 
{
    static String DectoNBase( int n, int num )
    {
        StringBuilder result=new StringBuilder();   //store the result

        while( num!=0 )
        {
            int rem=num%n;  //store reminder after dividing by n base
            if( rem<=9 )
            {
                //if reminder is less than 9 then it is added to the result
                result.append( rem );
            }
            else
            {
                //if rem is greater than 9 then it is a char thats why we use here 55 to adjust the values of character as 65 is the value of char 'A'
                int add=55+rem;
                result.append( (char)add );
            }
            num=num/n;
        }
        return result.reverse().toString();
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();   //enter the divisor
        int num=Sc.nextInt();    //enter the dividend

        String ans=DectoNBase( n, num );   //call method
        System.out.print( ans );    //print the answer
    }    
}
