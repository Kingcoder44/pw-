public class Patt
{
  public static void main (String[]args)
  {
	//Scanner ob = new Scanner (System.in);
	int i = 0, j = 0;
	  System.out.println ("Enter length");
	int n = 7;
	int m = (n-1)/2;
	for (i = 0; i < n; i++)
	  {
		//to print alphabet A
		for (j = 0; j < n; j++)
		  {
			if (i > 0 && j == 0 || i == 0 && j > 0 && j < n - 1 || i > 0
				&& j == n - 1 || i == (n - 1) / 2 && j >= 0)
			  System.out.print ("*");
			else
			  System.out.print (" ");
		  }
		  //to print alphabet B
		  System.out.print(" ");
		  for(j=0;j<n;j++)
		  {
		      if(i==0 &&  j<n-1 || j==0 && i>=0 || i==m && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1 && i!=m)
		      System.out.print("*");
		      else
		      System.out.print(" ");
		  }
		  //to print alphabet C
		  System.out.print("  ");
		  for (j = 0; j < n; j++)
		  {
		      if(i>0 && i<n-1 && j==0 || i==0 && j>0 || i==n-1 && j>0)
		      System.out.print("*");
		      else
		      System.out.print(" ");
		  }
		  //to print alphabet D
		  System.out.print("  ");
		  for (j = 0; j < n; j++)
		 {
		     if(i==0 &&  j<n-1 || j==0 && i>=0 || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1 )
		     System.out.print("*");
		      else
		      System.out.print(" ");
		 }
		  System.out.println();
		  
	  }
  }
}