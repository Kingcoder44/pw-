package GreedyAlgorithm;
import java.util.*;
class FractionalKnapsack
{
    static class Item{
        int profit,weight;
        Item(int p,int w)
        {
            profit=p;
            weight=w;
        }
    }
    public static double maxValue(Item[] a,int c)
    {
        int tp=0;
        Arrays.sort(a, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double i1 = Double.valueOf(o1.profit/ o1.weight);
                double i2 = Double.valueOf(o2.profit/ o2.weight);
                if(i1<i2)
                    return 1; //returning 1 indicates that we should swap the values.
                else
                    return -1;
            }
        });
        for(Item i: a)
        {
            int currW = (int)i.weight;
            int currP = (int)i.profit;
            if(c-currW>=0)
            {
                c=c-currW;
                tp+=currP;
            }
            else{
                double fra = ((double) c/(double)currW);
                tp+=(currP*fra);
                c-=(int)(currW*fra);
                break;
            }

        }
        return tp;
    }
    public static void main(String[] args) {
        Item[] arr= {new Item(25, 5),
                new Item(75, 10),
                new Item(100, 12),
                new Item(50, 4),
                new Item(45, 7),
                new Item(90, 9),
                new Item(30, 3)};

        System.out.println("Max Profit = "+maxValue(arr,37));
    }
}