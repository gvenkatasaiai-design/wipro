package arrays;
class Sum67 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6)
                ignore = true;
            else if (ignore && arr[i] == 7)
                ignore = false;
            else if (!ignore)
                sum += arr[i];
        }
        System.out.println(sum);
    }
}