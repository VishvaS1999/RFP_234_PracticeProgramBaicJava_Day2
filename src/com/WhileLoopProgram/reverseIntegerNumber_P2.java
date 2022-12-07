package com.WhileLoopProgram;

import java.util.Scanner;

public class reverseIntegerNumber_P2
{
    public static void main(String[] args)
    {
        int number=123;
        int reverse=0;
        while(number!=0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse Number is :- " +reverse);

    }
}
