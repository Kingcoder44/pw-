package Recursion;

import java.util.*;
class Fact
{
    public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    Fact obj = new Fact();
    System.out.println("Enter number whose factorial is to be found");
    int n =ob.nextInt();
    System.out.println("Factorial is : "+obj.factorial(n));
    }
    public int factorial(int n)
    {
        if(n<=0)
            return 1;
        else
            return n*factorial(n-1);
    }

}