package Stack;
import java.util.*;
public class Valid_Paren {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Stack<Character> s  = new Stack<>();
        String str  =ob.nextLine();
        for(char ch: str.toCharArray())
            if(ch=='{'||ch=='['||ch=='(')
                s.push(ch);
            else if
            (ch==']' &&  s.peek()=='[')
                s.pop();
            else if
            (ch=='}' &&  s.peek()=='{')
                s.pop();
            else if
             (ch==')' &&  s.peek()=='(')
                s.pop();
            else
                break;
if(s.isEmpty())
    System.out.println("Valid Parenthesis");
else
    System.out.println("Invalid Parenthesis");

    }
}
