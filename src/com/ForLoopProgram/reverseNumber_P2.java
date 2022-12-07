package com.ForLoopProgram;

public class reverseNumber_P2
{
    public static void main(String[] args)
    {
        int number=123, reverse=0;
        for(; number!=0;)
        {
            int remainder = number % 10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
