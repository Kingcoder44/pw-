package DynamicProgramming;
//Multiple matrix multiplication
public class MCM {
    //dimension-p[i-1]*[i]
    //i - in range 1 to n
    public static int matrixChain(int []p,int n)
    {
        int m[][] = new int[n][n];
        int i,j,k,l,q;
        //cost is zero when multiplying 1  matrix
        for(i=0;i<n;i++)
        {
            m[i][i]=0;
        }
        //l is length of chain
        for(l=2;l<n;l++)
        {
            for(i=1;i<n-l+1;i++)
            {
                j=i+l-1;
                if(n==j)
                {
                    continue;
                }
                m[i][j]=Integer.MAX_VALUE;
                for(k=i;k<=j-1;k++)
                {
                    //q-cost of scalar function
                    q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                    if(q<m[i][j])
                    {
                        m[i][j]=q;
                    }
                }
            }
        }
        return m[1][n-1];
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4};
        int n = a.length;
        System.out.println("Number of Scalar multiplication : "+matrixChain(a,n));
    }
}
