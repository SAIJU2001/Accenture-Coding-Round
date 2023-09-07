/*
Problem Statement

You are required to implement the following function.

Int OperationChoices(int c, int n, int a , int b )

The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.

( a+ b ) , if c=1
( a – b ) , if c=2
( a * b ) ,  if c=3
(a / b) ,  if c =4
Assumption : All operations will result in integer output.

Example:

Input
c :1
a:12
b:16
Output:
Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
Sample Input

 c : 2

 a : 16

 b : 20

Sample Output

-4
*/

import java.util.*;

public class Question12 
{
    static int operationChoices( int c, int a , int b )
    {
        if( c==1 )      //c=1 means addition
        {
            return a+b;
        }
        else if( c==2 )     //c=2 means subtraction
        {
            return a-b;
        }
        else if( c==3 )     //c=3 means multiplication
        {
            return a*b;
        }
        else if( c==4 )     //c=4 means divion
        {
            return a/b;
        }
        else
        {
            return -1;
        }
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        int c=Sc.nextInt();     //enter c value
        int a=Sc.nextInt();     //enter a value
        int b=Sc.nextInt();     //enter b value
        //function call and print the output
        System.out.print( operationChoices( c, a, b ));
    }  
}
