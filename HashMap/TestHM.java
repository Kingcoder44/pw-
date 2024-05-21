package HashMap;

import java.util.*;
/*implementation of basic functions of hash map like
1.put(k,v)
2.get(k)
3.remove(k)
4.containsKey(k)
5.map.entrySet() for iteration of hashmap
 */
public class TestHM {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Map<Integer, String> map =new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"C");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println("Map  : "+map);
        System.out.println("Value at key=1 :"+map.get(1));
        for(Map.Entry<Integer,String> e: map.entrySet())
            System.out.print(e.getKey()+"="+e.getValue()+" ");
        System.out.println();
        map.remove(2);
        System.out.println("Map contains key 2: "+map.containsKey(2));
        System.out.println("New map"+map);
    }
}
