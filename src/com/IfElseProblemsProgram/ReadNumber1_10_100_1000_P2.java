package com.IfElseProblemsProgram;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ReadNumber1_10_100_1000_P2
{
    public static void main(String[] args)
    {
        System.out.println("Enter Any Number i.e 1, 10, 100, 1000......");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number==1)
        {
            System.out.println("Unit");
        }
        else if (number==10)
        {
            System.out.println("Ten");
        }
        else if (number==100)
        {
            System.out.println("Hundred");
        }
        else if (number==1000)
        {
            System.out.println("Thousand");
        }
        else if (number==10000)
        {
            System.out.println("Ten Thousand");
        }
        else if (number==100000)
        {
            System.out.println("One Hundred Thousand");
        }
        else if(number==1000000)
        {
            System.out.println("One Million");
        }
        else
        {
            System.out.println("Invalid Number");
        }

    }
}
