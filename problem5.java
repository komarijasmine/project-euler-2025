// What is the smallest positive number that is evenly divisible by all of the numbers from 1-20?

public class problem5 {
    
    public static void main(String[] args) {
        System.out.println(divisible());
    }

    public static int divisible() {

        int answer = 20;
        boolean done = false;
        int count = 1; 
        while (!done) {
            answer = answer + 2;
            for (int i = 2; i <= 20; i++) {
                if (answer % i == 0) {
                    count++;
                }
                else {
                    count = 1;
                }
            }
            if (count == 20) {
                done = true;
            }
        }
        return answer; 
    }
}
