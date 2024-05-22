package HashMap;
import java.util.*;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
public class TwoSum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        TwoSum obj = new TwoSum();
        int a[];
        System.out.println("Enter size of array then elements");
        int n = ob.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        System.out.println("Enter target");
        int x = ob.nextInt();
        obj.solution(a,x);
    }
    public void solution(int a[],int n)
    {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i=0;i<a.length;i++)
            map.put(a[i],i);
        int result[] = new int[2];
        //to check sum
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(n-a[i]))
                if(map.get(n-a[i])>i)
                {
                    result[0]=i;
                    result[1]=map.get(n-a[i]);
                    break;
                }
        }
        System.out.println("The indexes are : [ "+result[0]+" , "+result[1]+" ]" );

    }
}
