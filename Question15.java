/*
 Problem Statement 

You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices

Example

enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7

7
 */

import java.util.*;

public class Question15 
{
    static int printSum( int arr[], int n)
    {
        //taking two list for store the odd and even position values
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        for( int i=0 ; i<n ; i++ )
        {
            if( i%2==0 )
            {
                //even position value added to the even list
                even.add( arr[i] );
            }
            else
            {
                //odd position value added to the odd list
                odd.add( arr[i] );
            }
        }
        //sort the two lists
        Collections.sort(odd);
        Collections.sort(even);

        //and the second largest values from odd and even list
        int result=odd.get(odd.size()-2)+even.get(even.size()-2);
        return result;
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();     //length of the array
        int arr[]=new int[n];

        for( int i=0 ; i<n ; i++ )
        {
            //array elements input
            arr[i]=Sc.nextInt();
        }
        //function call and print
        System.out.print( printSum( arr, n ));
    }   
}
