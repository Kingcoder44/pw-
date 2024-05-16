package Recursion;

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        System.out.println("Enter nth number to find from fibonacci series");
        int n =ob.nextInt();
        System.out.println(n+"th term of fibonacci  is : "+obj.fib(n));
    }
    public int fib(int n)
    {
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
