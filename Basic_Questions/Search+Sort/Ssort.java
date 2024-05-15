import java.util.Scanner;
class Bsort
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[],i,j,l,ptr;
        System.out.println ("Enter size of array");
	    l = ob.nextInt ();
	 a = new int[l];
	  System.out.println ("Enter elements");
	for ( i = 0; i < a.length; i++)
	    a[i] = ob.nextInt();
        System.out.println ("Before Sorting ");
	for ( i = 0; i < a.length; i++)
    System.out.print(a[i]+" ");
        for(i=0;i<l-1;i++)
        {
            ptr=i;
            for(j=i+1;j<l;j++)
            {
                if(a[j]<a[ptr])
                    ptr=j;
            }
                    int t=a[i];
                    a[i]=a[ptr];
                    a[ptr]=t;
            
            
        }

        System.out.println();
        System.out.println("After Sorting ");
	for ( i = 0; i < a.length; i++)
    System.out.print(a[i]+" ");
    }
}