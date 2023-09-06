/*
    Question:6
    (Asked in Accenture OnCampus 11 Aug 2021, Slot 3)

    You are required to implement the following Function 

    def LargeSmallSum(arr)

    The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

    Assumption:

    All array elements are unique
    Treat the 0th position as even
    NOTE

    Return 0 if array is empty
    Return 0, if array length is 3 or less than 3
    Example

    Input :     arr:3 2 1 7 5 4

    Output :    7

    Explanation
    Second largest among even position elements(1 3 5) is 3
    Second smallest among odd position element is 4
    Thus output is 3+4 = 7

    Sample Input :  arr: 1 8 0 2 3 5 6

    Sample Output :     8
 */

import java.util.*;

public class Question6 
{
    static int LargeSmallSum( int arr[] )
    {
        if( arr.length<=3 )
        {
            //this condition is given
            return 0;
        }

        //create two list to store even and odd indexes element separately
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        
        for( int i=0 ; i<arr.length ; i++ )
        {
            if( i%2==0 )
                even.add( arr[i]);  //add even
            else
                odd.add( arr[i]);   //add odd
        }

        //sort the two list
        Collections.sort(even);
        Collections.sort(odd);

        return even.get( even.size()-2 )+odd.get(1);
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

        int ans=LargeSmallSum(arr );   //call method
        System.out.print(ans);    //print the ans
    }
}
