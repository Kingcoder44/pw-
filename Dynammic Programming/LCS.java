package DynamicProgramming;
import java.util.*;
//program to find the longest common subsequence
public class LCS {
    public static void main(String[] args) {
        String x ="ABDALLA";
        String y = "ACABA";

        int m=x.length();
        int n=y.length();
        int r[][] =  new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            for(int j=0;j<=n;j++)
            {
                r[i][j]=-1;
            }
        System.out.println("Length of longest common substring "+ lcs(x,y,m,n,r));

    }

    private static int  lcs(String x, String y, int i, int j, int[][] r) {
        if(i==0 || j==0)
            return 0;
        if(r[i][j]!=-1)
            return r[i][j];

        if(x.charAt(i-1) == y.charAt(j-1))
        {
            r[i][j]=1+lcs(x,y,i-1,j-1,r);

        }
        else
            r[i][j]=Math.max(lcs(x,y,i-1,j,r),lcs(x,y,i,j-1,r));
        return r[i][j];
    }
}
