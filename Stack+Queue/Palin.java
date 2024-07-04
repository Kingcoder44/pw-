package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Palin {
    public static void main(String[] args) {
        Palin obj = new Palin();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter expression");
        String s = ob.nextLine();
        System.out.println("Is " + s + " palindrome : " + obj.check(s));
    }

    public boolean check(String s) {
        Stack<Character> st = new Stack<>();
        String sub = "";
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'X') {
                break;
            } else {
                st.push(ch);
                k = k + 1;
            }
        }
        k++;
        sub = s.substring(k);
        int i=0;
       while(k<s.length())
       { if (!st.isEmpty() && sub.charAt(i) == st.peek())
                st.pop(); k++;
       i++;}
        return st.isEmpty();
    }
}
