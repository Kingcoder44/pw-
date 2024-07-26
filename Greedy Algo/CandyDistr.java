package GreedyAlgorithm;

public class CandyDistr {
    static int distri(int a[])
    {
        int n=a.length;
        int dp[] = new int[n];
        //assigning 1 candy to each(atleast 1)
        for(int i=0;i<n;i++)
            dp[i]=1;
        //scanning from left to right
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                dp[i]=dp[i]+1;
        }
        //scanning form right to left
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1] && dp[i]<=dp[i+1]+1)
                dp[i]=dp[i+1]+1;
        }
        int s=0;
        for(int i:dp)
        {
            s+=i;
        }
        return s;
    }
    public static void main(String[] args) {
        int a[]= {1,2,87,87,87,2,1};
       System.out.println("Total Candies "+distri(a));
    }
}
