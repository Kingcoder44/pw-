package Stack;
import java.util.*;
//stack implementation using stack inbuilt function
public class Impli {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.peek();
        System.out.println(s.search(3));
        s.remove(2);
        System.out.println(s);


    }
}
