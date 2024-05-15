/*Given an integer array, duplicates are present in it in a way that all duplicates appear an even
number of times except one which appears an odd number of times. Find that odd appearing
element in linear time and without using any extra memory.*/
public class Main {
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,1,2,3,4,3};
        System.out.println("Odd occurring element: " + findOddOccurrence(arr));
    }
}
