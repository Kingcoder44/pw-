package HashMap;

import java.util.*;

/*Q2. Implement a Map in java which takes the input and print the list in sorted order based on value.
Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay
Output: {Krish=4,Lakshay=2,Lakshman=7,Rahul=5,Ram=1}*/

public class Q2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
       HashMap<Integer, String> map =new HashMap<>();
       TreeMap< String,Integer> map2 =new TreeMap<>();
        map.put(5,"Rahul");
        map.put(7,"Lakshman");
        map.put(1 ,"Ram");
        map.put(4, "Krrish");
        map.put(2 ,"Lakshay");
        System.out.println("Map  : "+map);
        for(Map.Entry<Integer,String> e:map.entrySet())
            map2.put(e.getValue(),e.getKey());
        System.out.println(map2);


    }
}
