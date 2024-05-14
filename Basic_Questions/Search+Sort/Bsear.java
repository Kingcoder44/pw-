import java.util.Arrays;
import java.util.Scanner;
public class Bsear
{
  public static void main (String[]args)
  {
	Scanner ob = new Scanner (System.in);
	  System.out.println ("Enter size of array");
	int f = -1, n = ob.nextInt ();
	int a[] = new int[n];
	  System.out.println ("Enter elements");
	for (int i = 0; i < a.length; i++)
	    a[i] = ob.nextInt();
	  System.out.println ("Enter elements to search");
	int x = ob.nextInt ();
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++)
	     System.out.println (a[i]+" ");
    int s=0,e=a.length-1,mid;
    while(s<=e)
    {
        mid=(s+(e-s))/2;
	if (x>a[mid])
	  s=mid+1;
	  else if(x<a[mid])
	  e=mid-1;
	  else{
	      f=0;
	      break;
	  }
    }
    if(f==0)
	  System.out.println ("Element found");
	else
	  System.out.println ("Element not found");

ob.close();
  }
}
