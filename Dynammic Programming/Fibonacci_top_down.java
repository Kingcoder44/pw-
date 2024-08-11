package DynamicProgramming;

import java.util.Scanner;

//DP top_down approach to solve fibonacci series
public class Fibonacci_top_down {
    public static int fib(int n)
    {
        int a=0,b=1,c;
        if(n==0)
            return 0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        System.out.print(c+",");
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter nth number to search for fibonacci term");
        int x= ob.nextInt();
        System.out.print("0,1,");
        System.out.println("\n"+x+"th term = "+fib(x));


    }
}
