/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Name
{
	public static void main(String[] args) {
		int i,j,n=7;
		int m=(n-1)/2;
		for(i=0;i<n;i++)
		{
		    for(j=0;j<n;j++)
		    {
		        if(j==0 || i+j==m || i-j==m )
		        System.out.print("*");
		        else
		        System.out.print(" ");
		        
		    }
		   // System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(i<n-1 && j==0 || i<n-1 && j==n-1 || i==n-1 && j>0 && j<n-1  )
		        System.out.print("*");
		        else
		        System.out.print(" ");
		        
		    }
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(  i==0 && j>0||i>0 && i<m && j==0 ||i==m && j>0 && j<n-1|| i==n-1 && j>0 && j<n-1 || j==n-1 && i>m && i<n-1 )
		        System.out.print("*");
		        else
		        System.out.print(" ");
		        
		    }
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(j==0 || j==n-1 || i==m)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(j==0 && i>0 || j==n-1 && i>0 || i==m || i==0 && j>0 && j<n-1)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(i==0 && j>0 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1  || j==n-1 && i>m && i<n-1 || i==m && j>=m)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(j==0 && i>0 || j==n-1 && i>0 && i<m || i==m && j<n-1 || i==0 && j>0 && j<n-1 || i>=m && j-i==0)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }  
		    System.out.print(" ");
		    for(j=0;j<n;j++)
		    {
		        if(j==0 && i>0 || j==n-1 && i>0 || i==m || i==0 && j>0 && j<n-1)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
