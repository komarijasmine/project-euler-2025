// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. 
// What is the 10 001st prime number?

public class problem7 {

    public static void main(String[] args) {
        int answer = 10;
        int a = 4;
        while (a <= 10001) {
            answer++;
            isprime(answer);
            a++;
            answer = isprime(answer);
        }
        System.out.println(answer);
    }

    public static int isprime(int y) {

        int x = y;

        if (x % 2 == 0) {
            x++;
        }

        for (int i = 3; i < x; i++) {

            if (x % i == 0) {
                    x++;
                }
            
            }

        return x;
    }    
}