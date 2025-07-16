// Find the sum of all the primes below two million.

public class problem10 {

    public static int n = 1;
    public static long sum = 0;
    public static void main(String[] args) {

        while (n < 2000000) {
            n++;
            if (primes(n)) {
                sum += n;
            }
        }
        System.out.println(sum);
    }

    public static boolean primes(int n) {
        boolean prime = false;

        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
    
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
