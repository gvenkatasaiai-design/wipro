package arrays;
class Only14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        boolean valid = true;
        for (int i : arr) {
            if (i != 1 && i != 4) {
                valid = false;
                break;
            }
        }
        System.out.println(valid);
    }
}