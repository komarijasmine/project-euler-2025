// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. 
// What is the 10 001st prime number?

public class problem7 {

    public static void main(String[] args) {
        int count = 50;
        while (count > 1) {
            count--;

        }
        }

    public static long prime() {

        long num = 13;
        int count = 0;
        long answer = -1;
    
        for (int i = 7; i <= 10001; i++) {
            boolean done = false;
            if (num % 2 == 0) {
                num++;
            }
            while (!done) {
                    for (long k = num - 1; k > 1; k--) {
                        if (num % k != 0) {
                            count++;
                            if (count == (num - 2)) {
                                answer = num;
                                done = true;
                            }
                        }
                        else {
                            num++;
                        }
                    }
                }
            }
        return answer;
        }

    }