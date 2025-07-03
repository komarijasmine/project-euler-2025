// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


public class problem6 {

    public static void main(String[] args) {
        System.out.println(difference());
    }

    public static int difference() {

        int totalSum = 0;
        int squaredSum = 0;
        int totalSquare = -1;
        int answer = -1;

        for (int i = 1; i <= 100; i++) {
            squaredSum += i * i;
            totalSum += i;
        }

        totalSquare = totalSum * totalSum;
        answer = totalSquare - squaredSum;

        return answer;
    }
}