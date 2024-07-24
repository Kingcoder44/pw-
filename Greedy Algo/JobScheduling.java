package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class JobScheduling {
    static class Item{
        int id,ddline,profit;

        Item(int id,int d,int p)
        {
            this.id=id;
            ddline=d;
            profit=p;

        }
    }
    public static int maxProfit(Item[] a,int m)
    {
        //size of array will be m
        //1.Sort array on basis of profit
        Arrays.sort(a, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if(o1.profit<o2.profit)
                    return 1;
                else
                    return -1;
            }
        });

        int tp=0;
        //creating an array to keep track of free time slots & fill the array with false initially
        boolean timeslot[] = new boolean[m];
        Arrays.fill(timeslot,false);


        //Filling the Array based on job Scheduling
        for(Item i: a)
        {
            for(int j=Math.min(m-1,i.ddline-1);j>=0;j--)
                if(!timeslot[j])
                {
                    timeslot[j]=true;
                    tp+=i.profit;

                    break;
                }
        } 
        return tp;
    }
    public static void main(String[] args) {
     Item[] arr = {new Item(1,5,55),
                    new Item(2,2,65),
             new Item(3,7,75),
             new Item(4,3,60),
             new Item(5,2,70),
             new Item(6,1,50),
             new Item(7,4,85),
             new Item(8,5,68),
             new Item(9,3,45)};
     //find max value of deadline
        int max=arr[0].ddline;
        for(int i=1;i<arr.length;i++)
            if(arr[i].ddline>max)
                max=arr[i].ddline;
        System.out.println(max);
        //get max profit
        System.out.println("Maximum profit in Job Scheduling = "+maxProfit(arr,max));
    }
}
