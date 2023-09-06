/*  Question 4:
    (Asked in Accenture OnCampus 11 Aug 2021, Slot 1)

    You are given a function,
    int findCount(int arr[], int length, int num, int diff);

    The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
    Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

    Example:
    
    Input:  arr: 12 3 14 56 77 13
            num: 13
            diff: 2
    Output: 3

    Explanation:
    Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
*/

import java.util.*;

public class Question4 
{
    static int findCount(int arr[], int length, int num, int diff)
    {
        int count=0;
        for( int i=0 ; i<length ; i++ )
        {
            //calculate the absolute value and comapre with diff
            if( Math.abs(arr[i]-num )<=diff )
                count++;
        }

        if( count==0 )
            return -1;

        return count;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int length=Sc.nextInt();    //enter the length of the array
        int arr[]=new int[length];

        for( int i=0 ; i<length ; i++ ) //input the array element
        {
            arr[i]=Sc.nextInt();
        }

        int num=Sc.nextInt();   //enter the num value
        int diff=Sc.nextInt();   //enter the diff value

        int count=findCount( arr, length, num, diff);   //call method
        System.out.print(count);    //print the ans
    }   
}
