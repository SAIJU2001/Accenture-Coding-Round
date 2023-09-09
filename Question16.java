/*
Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.

Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.

Test Cases:

Test Case 1:
Input:
5
Expected Result Value:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
275

Test Case 2:
Input:
12
Expected Result Value:
12, 24, 36, 48, 60, 72, 84, 96, 108, 120
660
*/

import java.util.*;

public class Question16 
{
    static void table( int n )
    {
        int sum=0;
        for( int i=1 ; i<=10 ; i++ )
        {
            //print the table
            System.out.print( i*n+" " );
            sum+=i*n;
        }
        System.out.println();
        System.out.print(sum);  //sum of the table
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();     //enter the value of n
        table(n);   //function call
    }
}
