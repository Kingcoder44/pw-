package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

import static DynamicProgramming.Fibonacci_top_down.fib;

//DP bottom up approach to solve fibonacci series
public class Fibonacci_bottom_up {
    public static int fib(int n)
    {
        int f[] = new int[n+1];
        Arrays.fill(f,-1);
        return fibhelp(f,n);
    }

    private static int fibhelp(int[] f, int n) {
        //base case
        if(n==0 || n==1)
            return n;
        //to check if we have already calculated
        if(f[n]!=-1)
            return f[n];
        //if not computed then compute the value
        //to compute last and second last term for nth value i.e n-1 and n-2
        int x = fibhelp(f,n-1);
        int y =fibhelp(f,n-2);
        f[n]=x+y;
        return f[n];

    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter nth number to search for fibonacci term");
        int x= ob.nextInt();
        System.out.println(x+"th term = "+fib(x));
    }
}
