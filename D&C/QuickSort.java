package Divide_Conquer;

import java.util.Scanner;

public class QuickSort {
    public void printArr(int a[])
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of elements to enter");
        int n = ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements elements");
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        System.out.println("Before Sort");
        obj.printArr(a);
        obj.Quicksort(a,0,n-1);
        System.out.println("After Sort");
        obj.printArr(a);
    }

    private void Quicksort(int[] a, int l, int u) {
        if(l<u)
        {
            int pivot = partition(a,l,u);
            Quicksort(a,l,pivot-1);
            Quicksort(a,pivot+1,u);
        }
    }

    private int partition(int[] a, int l, int u) {
        int p=a[l];
        int i=l,j=u;
        while(i<j)
        {
            while(a[i]<=p)
                i++;
            while(a[j]>p)
                j--;
            if(i<j)
                swap(a,i,j);
        }
        //swaping pivot
        swap(a,l,j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int t= a[i];
        a[i]=a[j];
        a[j]=t;
    }

}
