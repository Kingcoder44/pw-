package GreedyAlgorithm;

public class MajorityElement {
    static int majEle(int a[])
    {
        int majEle=a[0],majC=1;
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]==majEle)
            majC++;
            else{
                majC--;
                if(majC==0)
                {
                    majEle=a[i];
                    majC=1;
                }
            }
        }
        return majEle;
    }
    public static void main(String[] args) {
        int a[]={2,2,1,1,1,2,2};
        System.out.println("Majority Element : "+majEle(a));
    }
}
