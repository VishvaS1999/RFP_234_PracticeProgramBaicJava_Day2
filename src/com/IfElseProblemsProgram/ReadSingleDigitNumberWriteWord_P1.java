package com.IfElseProblemsProgram;

import java.util.Scanner;

public class ReadSingleDigitNumberWriteWord_P1
{
    public static void main(String[] args)
    {
        System.out.println("Enter Any Single Digit Number :- ");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();

        if(number==0)
        {
            System.out.println("The Number is Zero");
        }
        else if(number==1)
        {
            System.out.println("The Number is One");
        }
        else if(number==2)
        {
            System.out.println("The Number is Two");
        }
        else if(number==3)
        {
            System.out.println("The Number is Three");
        }
        else if(number==4)
        {
            System.out.println("The Number is Four");
        }
        else if(number==5)
        {
            System.out.println("The Number is Five");
        }
        else if(number==6)
        {
            System.out.println("The Number is Six");
        }
        else if(number==7)
        {
            System.out.println("The Number is Seven");
        }
        else if(number==8)
        {
            System.out.println("The Number is Eight");
        }
        else if(number==9)
        {
            System.out.println("The Number is Nine");
        }
        else
        {
            System.out.println("The Number is Invalid Number");
        }
    }
}
