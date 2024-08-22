package DynamicProgramming;

public class Catlan_Number {
    public static int catlan(int n)
    {
        int c[] = new int[n+2];
        c[0]=c[1]=1;
        for(int i=2;i<=n;i++)
        {
            c[i]=0;
            for (int j=0;j<i;j++)
            {
                c[i]+=c[j]*c[i-j-1];
            }
        }
        return c[n];
    }
    public static void main(String[] args) {
        System.out.println("Catlan for : 4");
        for(int i=0;i<=6;i++)
        {
            System.out.println(catlan(i));
        }
    }
}
