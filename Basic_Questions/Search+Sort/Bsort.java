import java.util.Scanner;
class Bsort
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[],i,j,l;
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
            for(j=0;j<l-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting ");
	for ( i = 0; i < a.length; i++)
    System.out.print(a[i]+" ");
    }
}