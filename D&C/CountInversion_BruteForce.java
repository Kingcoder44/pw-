package Divide_Conquer;

public class CountInversion_BruteForce {
    public int inversion(int a[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                    c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        CountInversion_BruteForce obj = new CountInversion_BruteForce();
    int a[] = {70,50,60,10,20,30,80,15};
    System.out.println("Number of Inversions = "+obj.inversion(a));
    }
}
