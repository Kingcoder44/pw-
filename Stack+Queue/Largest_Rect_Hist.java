package Stack;
import java.util.*;
//program to fin dlargest rectangle under histogram
public class Largest_Rect_Hist {

    // Function to calculate the largest rectangle area
    public int largestRectangleArea(int[] heights) {
        // write your code here
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        //to find left limit array
        for (int i = 0; i < heights.length; i++) {
            if (s.isEmpty()) {
                left[i] = 0;
                s.push(0);
            } else {
                while (!s.isEmpty() && heights[s.peek()] >= heights[i])
                    s.pop();
                if (s.isEmpty())
                    left[i] = 0;
                else
                    left[i] = s.peek() + 1;
                s.push(i);
            }
        }
        //to clear the stack for right limit
        while (!s.isEmpty())
            s.pop();
        int n = heights.length;
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                right[i] = n - 1;
                s.push(i);
            }
            else
            {
                while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                    s.pop();
                if(s.isEmpty())
                    right[i]=n-1;
                else
                    right[i]=s.peek()-1;
                s.push(i);
            }
        }
        int mx_ar=0;
        for(int i=0;i<n;++i)
            mx_ar=Math.max(mx_ar,heights[i]*(right[i]-left[i]+1));
        return mx_ar;
    }
    // Helper function to print the result
    public void printResult(int result) {
        System.out.println("Largest Rectangle Area: " + result);
    }

    public static void main(String[] args) {
        Largest_Rect_Hist histogram = new Largest_Rect_Hist();
        int[] heights = {2, 1, 5, 6, 2, 3};

        int result = histogram.largestRectangleArea(heights);

        histogram.printResult(result);
    }
}
