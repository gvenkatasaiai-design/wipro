package arrays;
class AsciiToCharacter {
    public static void main(String[] args) {
        int[] ascii = {65, 66, 67, 68, 69, 97, 98, 99};
        for (int i = 0; i < ascii.length; i++) {
            System.out.print((char) ascii[i] + " ");
        }
    }
}