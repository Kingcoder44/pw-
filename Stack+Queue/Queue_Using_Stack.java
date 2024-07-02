package Queue;

import java.util.*;

//program to implement queue using stack
public class Queue_Using_Stack {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Queue_Using_Stack obj = new Queue_Using_Stack();
        System.out.println("Enter number of elemtns to enter");
        int n = ob.nextInt();
        Stack<Integer> s1  = new Stack<>();
        Stack<Integer> s2  = new Stack<>();
        for(int i =0;i<n;i++)
            s1.push(ob.nextInt());
        System.out.println("Queue is : "+s1);
        for(int i =0;i<n;i++)
            s2.push(s1.pop());
        System.out.println("Displaying FIFO functionality");
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }
}
