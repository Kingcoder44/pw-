package DynamicProgramming;


public class CoinChangeProblem {
public static int countWays(int coins[],int n,int sum)
{
    int []t = new int[sum+1];
    t[0]=1;

        for(int i=0;i<n;i++)
        {
            for (int j=coins[i];j<=sum;j++)
            {
                t[j]+=t[j-coins[i]];
            }
        }
        return t[sum];
}

    public static void main(String[] args) {
        int []coins = {1,2,3};
        int sum = 4;
        System.out.println("Total number of ways : "+countWays(coins,coins.length,sum));
    }
}
