package Divide_Conquer;
//program to find maximum and minimum in an array

public class Max_Min {
    static class Pair{
    int min;
    int max;
    }
    public static void main(String[] args) {
        int a[] = {20,50,10,15,25,55};
        int n=a.length;
        Pair obj = findMinMax(a,0,n-1);
        System.out.println("Minimum = "+obj.min);
        System.out.println("Maximum = "+obj.max);
    }

    public  static Pair findMinMax(int[] a, int l, int u) {
    Pair minmax = new Pair();
    Pair lminmax= new Pair();
    Pair rminmax= new Pair();
    //1.Small Problem
        //if no.of element is 1
        if(l==u)
        {
            minmax.min=a[l];
            minmax.max = a[l];
            return minmax;
        }
        //if no. of elements is 2
        else if(l==u-1)
        {   if(a[l]<a[u])
            {
                minmax.min=a[l];
                minmax.max=a[u];
            }
            else
            {
                minmax.min=a[u];
                minmax.max=a[l];
            }
        }
     //2.Big Problem
        else
        {
            //Divide
            int mid=l+(u-l)/2;
            lminmax=findMinMax(a,l,mid);
            rminmax=findMinMax(a,mid+1,u);
            minmax.min=(lminmax.min< rminmax.min)? lminmax.min : rminmax.min;
            minmax.max=(lminmax.max> rminmax.max)? lminmax.max : rminmax.max;
        }
        return minmax;
    }
}
