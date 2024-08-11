package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class staircase_problem_bottom_up {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of stairs");
        int n= ob.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Number of ways = "+countWays(dp,n));
    }

    private static int countWays(int[] dp,int n) {
        if(n==0||n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]=countWays(dp,n-1)+countWays(dp,n-2);
        return dp[n];
    }
}
