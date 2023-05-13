import java.util.*;
import java.io.*;

class Sqrt {
    int sqrt(int num) {
        int s = 0, e = num, mid, f = -1, val;
        while (s <= e) {
            mid = (s + e) / 2;
            val = mid * mid;
            if (num == val)
                return mid;
            else if (num < val) {
                f = mid;
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number");
        int n = ob.nextInt();
        Sqrt sqrtObj = new Sqrt();  // Create an instance of the Sqrt class
        int result = sqrtObj.sqrt(n);  // Call sqrt method on the instance
        System.out.println("Square Root of a number " + result);
    }
}
