import java.util.Scanner;
/**
 * Heap_Deletion
 */
public class Heap_Deletion {
    //to swap the elements
    void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    //to maintain max heap
    void heapify(int a[],int n,int i)
    {
        int  largest=i; //to find largest node
        int l=2*i+1; //to find left node
        int r=2*i+2;    //to find right node
        //to check if left node greater than largest
        if(l<n && a[l]>a[largest])
            largest=l;
        //to check if right node greater than largest    
        if(r<n && a[r]>a[largest])
            largest=r;
        //when node to remove is not root node
        if(largest!=i) 
        {
            swap(a, i, largest);
            heapify(a, n, largest);
        }
    }
    //to remove the node we pass array and size
    int delete(int a[], int n)
    {
        //to swap last node with first
        int lastnode=a[n-1];
        a[0]=lastnode;
        n--;
        heapify(a,n,0);
        return n; //to return the updated value of n i.e. n--
    }public static void printArray(int a[],int n)
    {//to dispaly elements of array
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner ob = new Scanner(System.in);
        Heap_Deletion obj = new Heap_Deletion();
        //maximum size of the heap
        int MAX = 100;

        int[] arr = new int[MAX];

        //initialize values
        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 50;
        arr[4] = 55;

        //take current size of the array
        int n = 5;

        System.out.println("Before delete operation, elements are : ");
        printArray(arr, n);

        n = obj.delete(arr, n);

        System.out.println("Total elements in the heap : " + n);
        System.out.println("After insert operation, elements are : ");
        printArray(arr, n);
    }
}