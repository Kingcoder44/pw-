package Stack;
import java.util.*;
public class Postfix {
    public static void main(String[] args) {
    Postfix obj = new Postfix();
        Scanner ob = new Scanner(System.in);
    System.out.println("Enter postfix expression");
    String s=ob.next();
    System.out.println("Answer = "+obj.evalu(s));
    }
    public int evalu(String str)
    {
        int a,b,r=0;
        Stack<Integer> s = new Stack<>();
        for(char ch: str.toCharArray())
        {
            if(ch=='+'||ch=='*'||ch=='-'||ch=='/')
            {
                b=s.pop();
            a=s.pop();

        switch (ch) {
            case '+':
                r = a + b;
                break;
            case '-':
                r = a - b;
                break;
            case '*':
                r = a * b;
                break;
            case '/':
                if (b != 0) {
                    r = a / b;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
                break;
                    }
                s.push(r);
            }
            else
             s.push(ch-'0');
        }
       return s.pop();
    }
}
