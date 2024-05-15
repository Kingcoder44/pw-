
//program to find the first and last occurentce of an element 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner ob = new Scanner (System.in);
	System.out.println ("Enter size of array");
	int f = -1, n = ob.nextInt ();
	int a[] = new int[n];
	  System.out.println ("Enter elements");
	for (int i = 0; i < a.length; i++)
	    a[i] = ob.nextInt();a
	System.out.println ("Enter elements to search");
	    int x = ob.nextInt ();
        Arrays.sort(a);
        int s=0,e=a.length-1,mid,result=-1;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(a[mid]==x)
            {//for first occurence
                result=mid;
                e=mid-1;
            }
            else if(x<a[mid])
            e=mid-1;
            else
            s=mid+1;
        }
        int lo=-1;
        s=0;e=a.length-1;
         while(s<=e)
        {
            mid=(s+e)/2;
            if(a[mid]==x)
            {//for last occurence we will check in right hand side of mid to see if any x is remaining
                lo=mid;
                s=mid+1;
            }
            else if(x<a[mid])
            e=mid-1;
            else
            s=mid+1;
        }
        if(result!=-1)
	  System.out.println ("Element first occured at "+result);
	else
	  System.out.println ("Element not found");
	  if(result!=-1)
	  System.out.println ("Element last occured at "+lo);
	else
	  System.out.println ("Element not found");
	}
}
