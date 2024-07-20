package Divide_Conquer;

import java.util.Scanner;

public class SelectionProcedure {
    public int selection(int a[],int l,int u,int k)
    {
        if(l<u)
        {
            int p=partition(a,l,u);
            if(p==k-1)
                return a[p];
            else if (k-1<p)
               return selection(a,l,p-1,k);
            else
                return selection(a,p+1,u,k);
        }
        return a[l];
    }

    private int partition(int[] a, int l, int u) {
        int p = a[l];
        int j=u;
        int i=l+1;
        while(i<=j)
        {
            while(a[i]<=p)
                i++;
            while(a[j]>p)
                j--;
            if(i<j)
            swap(a,i,j);
        }
        swap(a,l,j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void main(String[] args) {
        SelectionProcedure obj = new SelectionProcedure();
        Scanner ob = new Scanner(System.in);
        int a[] = {70,50,60,10,20,30,80,15};
        int a1[] = {10,50,20,70,60,30};
        System.out.println("Enter kth smallest elemnet to search");
        int k = ob.nextInt();
        System.out.println(k+"th smallest elemnet = "+obj.selection(a1,0,a1.length-1,k));
    }
}
 
