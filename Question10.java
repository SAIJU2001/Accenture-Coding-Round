/*
    Question:10
    (Asked in Accenture Offcampus 1 Aug 2021, Slot 2)

    Problem Statement

    A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

    You are required to implement the following function.

    Int NumberOfCarries(int num1 , int num2);

    The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

    Assumption: num1, num2>=0

    Example:

    Input:  Num 1: 451
            Num 2: 349
    Output:     2
    Explanation:

    Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.

    Sample Input :    Num 1: 23
                      Num 2: 563

    Sample Output :     0
 */

import java.util.*;

public class Question10 
{
    static int numberOfCarries( int num1 , int num2 )
    {
        int carry=0,count=0;
        while( num1!=0 && num2!=0 )
        {
                //extract last digit from both the nums
                int l1=num1%10;
                int l2=num2%10;

                //calculate recent bits sum with previous carry
                int sum=carry+l1+l2;

                //check any carry is present if present increment the count
                carry=sum/10;
                if( carry>0 )
                        count++;
                //eliminate the digit recent calculated 
                num1=num1/10;
                num2=num2/10;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num1=Sc.nextInt();   //enter the num1
        int num2=Sc.nextInt();    //enter the num2
        //call the functions and print the value
        System.out.print( numberOfCarries( num1 , num2 ));
    }     
}
