package com.WhileLoopProgram;

import java.util.Scanner;

public class SumNNumbers
{
    public static void main(String[] args)
    {
       int number=1;
        int sum=0;
        while (number<=5)
        {
            System.out.print(number+ " + ");
            sum=sum+number;
            number++;
        }
        System.out.print(" = " +sum);

    }
}
