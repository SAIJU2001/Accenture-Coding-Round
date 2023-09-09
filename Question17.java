/*
Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.

Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.
*/

import java.util.*;

public class Question17 
{
    static boolean palindrome( int n )
    {
        int num=n,sum=0;
        while( num!=0 )
        {
            //reverse the number
            int rev=num%10;
            sum=sum*10+rev;
            num/=10;
        }
        //check original and reverse are same or not
        if( n==sum )
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
    public static void main(String args[]) 
    {
        Scanner Sc=new Scanner(System.in);
        int r1=Sc.nextInt();    //lower range limit
        int r2=Sc.nextInt();    //upper range limit
        for( int i=r1 ; i<=r2 ; i++ )
        {
            //check every value is palindrome or not
            if( palindrome( i ))
            {
                System.out.print(i+" ");
            }
        }
    }
}
