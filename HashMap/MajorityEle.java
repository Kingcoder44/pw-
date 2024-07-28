package HashMap;
//checkla gain
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityEle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array then elements:");
        int n = ob.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ob.nextInt();
        }

        // Step 1: Count occurrences using a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        // Step 2: Find the majority element
        int majorityElement = -1;
        int majorityCount = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityElement = entry.getKey();
                break;
            }
        }

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
}
