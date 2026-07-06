package arrays;
import java.util.Arrays;
class SortArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 3, 56};
        Arrays.sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}