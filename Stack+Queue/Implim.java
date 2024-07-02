package Stack;

import java.util.*;
//implemenetation of stack using array
public class Implim {
    static int n, a[] ;int top=-1;
    public static void main(String[] args) {
        Implim obj = new Implim();
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter number of elements to enter");
        n = ob.nextInt();
        a=new int[n];
        System.out.println("Enter stack elements");
        for(int i=0;i<n;i++)
            obj.push(ob.nextInt());
       // obj.push(3); System.exit(0);uncomment to show overflow statement
        for(int i=0;i<n;i++)
            obj.pop();
        //obj.pop(); System.exit(0); uncommment to show underflow condition

    }
    public void push(int x)
    {
        if(top==n-1)
            System.out.println("Overflow");
        else
            a[++top]=x;
    }
    public void pop()
    {
        if(top==-1)
            System.out.println("Underflow");
        else
        {
            System.out.println("Popped Element : "+a[top]);
            top-=1;
        }
    }
}
