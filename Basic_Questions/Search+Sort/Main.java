//program to perform linear Search
import java.util.Scanner;
public class Main
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
	for (int i = 0; i < a.length; i++)
	  if (a[i] == x)
		{f = 0;
		  break;
		  
		}


	if (f == 0)
	  System.out.println ("Element found");
	else
	  System.out.println ("Element not found");

ob.close();
  }
}
