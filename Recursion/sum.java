package Recursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        sum obj = new sum();
        System.out.println("Enter number");
        int a = ob.nextInt();
        System.out.println("Sum of digits = "+obj.sum(a));
}
public int sum(int n)
{
    if (n==0)
        return 0;
    else if(n%2==0)
        return -n+sum(n-1);
    else
        return n+sum(n-1);
}
}

