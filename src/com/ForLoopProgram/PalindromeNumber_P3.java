package com.ForLoopProgram;

public class PalindromeNumber_P3
{
    public static void main(String[] args)
    {
        int number=121, reverse=0 ,originalNumber=number;
        for(; number!=0 ;)
        {
            int reminder=number%10;
            reverse=reverse*10+reminder;
            number=number/10;
        }
        System.out.println(reverse);
        if(originalNumber==reverse)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
}
