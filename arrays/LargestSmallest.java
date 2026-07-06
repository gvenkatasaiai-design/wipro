package arrays;
import java.util.Arrays;
class LargestSmallest {
    public static void main(String[] args) {

        int[] arr = {23, 56, 11, 89, 4, 67};

        Arrays.sort(arr);

        System.out.println("Smallest = " + arr[0]);
        System.out.println("Second Smallest = " + arr[1]);

        System.out.println("Largest = " + arr[arr.length - 1]);
        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}