/*
 *Problem Statement :

You are given a function, void MaxInArray(int arr[], int length); The function accepts an integer array ‘arr’ of size ‘length’ as its argument. Implement the function to find the maximum element of the array and print the maximum element and its index to the standard output 

(STDOUT). The maximum element and its index should be printed in separate lines.

Note: 

Array index starts with 0 
Maximum element and its index should be separated by a line in the output 
Assume there is only 1 maximum element in the array 
Print exactly what is asked, do not print any additional greeting messages 
Example: 

Input: 

23 45 82 27 66 12 78 13 71 86 

Output: 

86 

9 

Explanation: 

86 is the maximum element of the array at index 9. 
 */

 import java.util.*;

public class Question19 
{
    static void maxInArray( int arr[], int n)
    {
        int max=0,ind=-1;
        for( int i=0 ; i<n ; i++ )
        {
            //find maximum element and store the element and index also
            if( max<arr[i] )
            {
                max=arr[i];
                ind=i;
            }
        }
        //print max element and index
        System.out.print( max+" is the maximum element of the array at index "+ind );
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();     //array length
        int arr[]=new int[n];
        for( int i=0 ; i<n ; i++ )
        {
            //input array elements
            arr[i]=Sc.nextInt();
        }
        maxInArray( arr, n);    //function call
    }
}
