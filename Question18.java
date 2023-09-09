/*
 Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. The submitted code should be logically/syntactically correct and pass all the test cases.

Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2
 */

import java.util.*;

public class Question18 
{
    public static void main( String args[])
    {
        Scanner Sc=new Scanner(System.in);
        //input all the values
        float x1=Sc.nextInt();
        float x2=Sc.nextInt();
        float x3=Sc.nextInt();
        float y1=Sc.nextInt();
        float y2=Sc.nextInt();
        float y3=Sc.nextInt();

        //calculate the distances
        float first=(float)Math.sqrt( Math.pow(x2-x1,2)+ Math.pow(y2-y1,2) );
        float second=(float)Math.sqrt( Math.pow(x3-x1,2)+ Math.pow(y3-y1,2) );
        float third=(float)Math.sqrt( Math.pow(x3-x2,2)+ Math.pow(y3-y2,2) );

        //add the distances and print 
        System.out.print(first+second+third);
    }
}
