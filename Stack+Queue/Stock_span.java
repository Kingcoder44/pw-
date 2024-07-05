package Stack;
import java.util.*;
public class Stock_span {

    // Function to calculate span
    public int[] calculateSpan(int[] prices) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int span[] = new int[prices.length];
        span[0]=1;
        for(int i=1;i< prices.length;i++)
        {
            while(!s.isEmpty() && prices[s.peek()]<=prices[i])
            {
                s.pop();
            }
                if(s.isEmpty())
                    span[i]=i+1;
                else
                    span[i]=i-s.peek();
            s.push(i);
        }
        return span;
        // write your code here
    }

    // Helper function to print the array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stock_span stockSpan = new Stock_span();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = stockSpan.calculateSpan(prices);

        stockSpan.printArray(span);
    }
}
