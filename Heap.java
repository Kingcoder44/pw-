import java.util.Scanner;
/*
 *Heap Insertion
 */
public class Heap {
    //to swap the elements
    void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    //to maintain max heap pass array, size and index of current node
    void heapify(int a[],int n, int i)
    {
        //to find parent node
        int parent =(i-1)/2;
        if(a[parent]>0)
        {
            //to check if current node is greater than parent node then swap and maintain max heap
            if(a[i]>a[parent])
            {
                swap(a,parent,i);
                heapify(a, n ,parent);
            }
        }
    }
    //to insert new element
    int insert(int a[],int n,int value)
    {
        n++;    //to increse size of heap after adding new element
        a[n-1]=value;
        heapify(a, n, n-1); //to maintain max heap
return n; //to return new size of heap
    }
   public static void printArray(int a[],int n)
    {//to display heap elements
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Heap obj = new Heap();
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

        int value = 80;

        System.out.println("Before insert operation, elements are : ");
        printArray(arr, n);

        n = obj.insert(arr, n, value);

        System.out.println("Total elements in the heap : " + n);
        System.out.println("After insert operation, elements are : ");
        printArray(arr, n);
    }
}
