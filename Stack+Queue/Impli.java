package Queue;

import Stack.Implim;

import java.util.Arrays;
import java.util.Scanner;

public class Impli {
         static int n, a[] ;int top=-1,rear=-1;
        public static void main(String[] args) {
            Impli obj = new Impli();
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter number of elements to enter");
            n = ob.nextInt();
            a=new int[n];
            System.out.println("Enter stack elements");
            for(int i=0;i<n;i++)
                obj.enqueue(ob.nextInt());
            System.out.println(Arrays.toString(a));
            // obj.push(3); System.exit(0);uncomment to show overflow statement
            for(int i=0;i<n;i++)
                obj.dequeue();
            obj.dequeue(); System.exit(0); //uncommment to show underflow condition
        }
        public void enqueue(int x)
        {
            if(top==n)
                System.out.println("Overflow");
            else
                a[++top]=x;
        }
        public void dequeue()
        {
            if(rear>=n)
            System.out.println("Underflow");
            else
                System.out.println("Element removed "+a[++rear]);
        }
}
