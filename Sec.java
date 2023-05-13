import java.util.*;
public class Sec
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner (System.in);
        int i,j;
        int a[][];
        System.out.println("enter rows and column number in order ");
        int x=ob.nextInt();
        a = new int[x][x];
System.out.println("Enter elements");
for(i=0;i<x;i++)
      for(j=0;j<x;j++)
        a [i][j]=ob.nextInt();
System.out.println();    
for(i=0;i<x;i++)
      for(j=0;j<x;j++)
          if((i+j)<(x-1))
             System.out.print(a[i][j]+" ");
}
    
}
    