package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
       power obj = new power();
        System.out.println("Enter base and power");
        int a = ob.nextInt();
        int n =ob.nextInt();
        System.out.println(a+"^"+n+"="+obj.powe(a,n));
    }
    public int powe(int a,int n)
    {
        if(n<=0)
            return 1;
        else
            return a*powe(a,n-1);
    }
}
