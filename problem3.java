public class problem3 {

    public static void main(String[] args) {
        long num = 600851475143L; 
        System.out.println(largestPrimeFactor(num)); // should print 6857
    }

    public static long largestPrimeFactor(long n) {
        long factor = 2;

        while (factor * factor <= n) {
            if (n % factor == 0) {
                n /= factor;
            } else {
                factor++;
            }
        }

        return n; // ← this is the largest prime factor
    }
}
