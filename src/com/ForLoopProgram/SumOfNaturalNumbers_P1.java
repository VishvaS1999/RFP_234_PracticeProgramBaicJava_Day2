package com.ForLoopProgram;

public class SumOfNaturalNumbers_P1
{
    public static void main(String[] args)
    {
        System.out.println("The Sum Of 5 Natural Numbers : ");
        int sum=0;
        for(int i=1; i<=5; i++)
        {
            System.out.print(i + " + ");
            sum=sum+i;
        }
        System.out.println(" = " +sum);
    }
}
