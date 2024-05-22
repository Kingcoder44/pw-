package HashMap;
import java.util.*;
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstOccu {
        public int firstUniqChar(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            int c=1;
            for(int i=0;i<s.length();i++)
                //if map doees not contain the character
                if(!map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i),c);
                    //if map contains the character
                else
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);

            for(int i=0;i<s.length();i++)
                if(map.get(s.charAt(i))==1)
                    return s.indexOf(s.charAt(i));

            return -1;

        }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        FirstOccu pbj = new FirstOccu();
        System.out.println("Enter String to get first occurence of unique character");
        String s = ob.nextLine();
        System.out.println("First unique character index in "+s+" : "+pbj.firstUniqChar(s));
    }
}

