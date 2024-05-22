package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Q1. Implement a Map in java which takes the input and print the list in sorted order based on key.
//Input: 5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay
//Output: {1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=lakshman}
public class Q1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
       TreeMap<Integer, String> map =new TreeMap<>();
        map.put(5,"Rahul");
        map.put(7,"Lakshman");
        map.put(1 ,"Ram");
        map.put(4, "Krrish");
        map.put(2 ,"Lakshay");
        System.out.println("Map  : "+map);


    }
}
