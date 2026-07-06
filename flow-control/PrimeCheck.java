package flow_control;
class PrimeCheck {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean prime = true;
        if (n <= 1)
            prime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");
    }
}