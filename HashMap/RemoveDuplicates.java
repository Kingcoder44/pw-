package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void remove(int a[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a)
        {
            if(!map.containsKey(i))
                map.put(i,1);
            else {
                map.put(i,map.get(i)+1);
            }
        }
        System.out.print(" [ ");
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            System.out.print(e.getKey()+" ");
        }
        System.out.print(" ] ");
    }
    public static void main(String[] args) {
        int a[] = {4,1,4,1,3,45,1,4,22,4,15,90};
        remove(a);
    }
}
