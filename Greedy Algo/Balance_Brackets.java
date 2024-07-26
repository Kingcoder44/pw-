package GreedyAlgorithm;
import java.util.*;
class Balance_Brackets
{
    static int bal(String s)
    {
        int cl=0,cr=0,imb=0,swap=0;
        for(char i : s.toCharArray()) {
            if (i == '[') {
                imb++;
            } else if (i == ']') {
                if (imb > 0)
                    imb--;
                else {
                    imb++;
                    swap++;
                }
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        String s1 = "]]][[[";
        System.out.println("Number of Swaps : "+bal(s1));

    }
}