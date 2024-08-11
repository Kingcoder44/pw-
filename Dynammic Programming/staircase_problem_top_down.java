package DynamicProgramming;

import Trees.PathSum;

import java.util.Scanner;

import static DynamicProgramming.Fibonacci_top_down.fib;

//DP top-down approach to solve staircase problem which uses extra variable w/o table
public class staircase_problem_top_down {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of stairs");
        int n= ob.nextInt();
        System.out.println("Total ways to climb"+n+"stairs = "+count(n));

    }

    private static int count(int n) {
        int prev1=1,prev2=1,c;
        if(n==0)
            return n;
        for(int i=2;i<=n;i++)
        {
            c=prev1+prev2;
            prev1=prev2;
            prev2=c;
        }
        return prev2;
    }
}
