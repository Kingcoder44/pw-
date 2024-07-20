package Divide_Conquer;

public class CountInversion_Optimised {

    public static void main(String[] args) {
        CountInversion_Optimised obj = new CountInversion_Optimised();
        int a[] = {70,50,60,10,20,30,80,15};
        System.out.println("Number of Inversions = "+obj.inversion(a,0,a.length-1));
    }

    public int  inversion(int[] a,int l,int h) {
        int c=0;
        if(l<h) {
            //1.Divide

            int m = l + (h - l) / 2;
            //2.Conquer
            c+=inversion(a,l,m);
            c+=inversion(a,m+1,h);
            //Combine
            c+=inverPro(a,m,l,h);
        }
        return c;
    }

    private int inverPro(int[] a, int m, int l, int h) {
    int i,j,k=l,c=0;
        int n1 = m-l+1;
    int n2 = h-m;
    int ls[] = new int[n1];
    int rs[] = new int[n2];
    //filling right and left subarray
        for(i=0;i<n1;i++)
            ls[i]=a[l+i];
        for(j=0;j<n2;j++)
            rs[j]=a[m+1+j];
        i=j=0;
        while(i<n1 && j<n2)
        {
            if(ls[i]<=rs[j])
                a[k++]=ls[i++];
            else {
                a[k++] = rs[j++];
                c+=(n1-i);
            }

        }
        while(i<n1)
        {
            a[k++]=ls[i++];
        }

        while(j<n2)
        {
            a[k++]=rs[j++];
        }
        return c;

    }
}
