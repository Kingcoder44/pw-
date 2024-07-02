package Queue;

import java.util.*;
public class Stack_Using_Queue {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Stack_Using_Queue obj = new Stack_Using_Queue();
        System.out.println("Enter number of elemtns to enter");
        int n = ob.nextInt();
        Queue<Integer> q1 = new LinkedList<>();

        Queue<Integer> q2 = new LinkedList<>(); 
        for (int i = 0; i < n; i++)
            q1.add(ob.nextInt());
        System.out.println("Queue is : " + q1);
        for (int i = 0; i < n; i++)
            q2.add(q1.poll());
        System.out.println("Enter 2 elements t0 enter in stack");
        q1.add(ob.nextInt());
        q1.add(ob.nextInt());
        for (int i = 0; i < n; i++)
            q1.add(q2.poll());
        System.out.println("Displaying LIFO functionality");
        System.out.println(q1.poll());
        System.out.println(q1.poll());
    }
}