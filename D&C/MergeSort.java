package Divide_Conquer;
import java.util.*;
public class MergeSort {
    static int n,a[];
    public void mergeSort(int a[],int l,int u) {
        if (l < u) {
            int mid = l + (u - l) / 2;
            //1.Divide the array into subproblems
            //2.Conquer the subproiblem using recursion
            mergeSort(a, l, mid );
            mergeSort(a, mid + 1, u);
            //Combine the reseult
            mergeProcedure(a, l, u, mid);
        }
    }
    public void mergeProcedure(int a[],int l,int u,int mid)
    {
        int i,j,k,n1,n2;
        //1.size of left and right subarray
        n1=mid-l+1;
        n2=u-mid;
        //2.initializing subarray
        int lSub[] =  new int[n1];
        int rSub[] =  new int[n2];
        //3.Filling elements in left and right subarray from a[]
        for(i=0;i<n1;i++)
            lSub[i]=a[l+i];
        for(j=0;j<n2;j++)
            rSub[j]=a[mid+j+1];
        //Sorting elements by comparing left and right subarray
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
                if(lSub[i]<=rSub[j])
                {
                    a[k]=lSub[i];
                    i+=1;
                }
                 else
                {

                    a[k]=rSub[j];
                    j+=1;
                }
                 k=k+1;

        }
        while(i<n1)
        {
            a[k]=lSub[i];
        i+=1;
        k+=1;
        }   

        while(j<n2)
        {
            a[k]=rSub[j];
            j+=1;
            k+=1;
        }

    }
    public void printArr(int a[])
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of elements to enter");
        n = ob.nextInt();
        a=new int[n];
        System.out.println("Enter array elements elements");
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        System.out.println("Before Sort");
        obj.printArr(a);
        obj.mergeSort(a,0,n-1);
        System.out.println("After Sort");
        obj.printArr(a);
    }
}
